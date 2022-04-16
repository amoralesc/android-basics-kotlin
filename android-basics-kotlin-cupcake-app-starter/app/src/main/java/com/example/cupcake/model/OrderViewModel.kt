package com.example.cupcake.model

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel
import com.example.cupcake.R
import java.text.NumberFormat
import java.text.SimpleDateFormat
import java.util.*

private const val PRICE_PER_CUPCAKE: Double = 2.00
private const val PRICE_FOR_SAME_DAY_PICKUP: Double = 3.00

class OrderViewModel : ViewModel() {
	// MutableLiveData with its LiveData getter
	// quantity (int)
	// flavor (String)
	// date (String)
	// price (String)
	private val _quantity = MutableLiveData<Int>()
	val quantity: LiveData<Int>
		get() = _quantity

	private val _flavor = MutableLiveData<String>()
	val flavor: LiveData<String>
		get() = _flavor

	private val _date = MutableLiveData<String>()
	val date: LiveData<String>
		get() = _date

	private val _price = MutableLiveData<Double>()
	val price: LiveData<String> = Transformations.map(_price) {
		NumberFormat.getCurrencyInstance().format(it)
	}

	val dateOptions = getPickupOptions()

	init {
		resetOrder()
	}

	fun resetOrder() {
		_quantity.value = 0
		_flavor.value = ""
		_date.value = dateOptions[0]
		_price.value = 0.0
	}

	// Setters for quantity, flavor and date
	fun setQuantity(numberCupcakes: Int) {
		_quantity.value = numberCupcakes
		updatePrice()
	}

	fun setFlavor(flavor: String) {
		_flavor.value = flavor
	}

	fun setDate(date: String) {
		_date.value = date
		updatePrice()
	}

	fun hasNoFlavorSet(): Boolean {
		return _flavor.value.isNullOrEmpty()
	}

	private fun getPickupOptions(): List<String> {
		val options = mutableListOf<String>()
		val formatter = SimpleDateFormat("E MMM d", Locale.getDefault())
		val calendar = Calendar.getInstance()
		repeat(4) {
			options.add(formatter.format(calendar.time))
			calendar.add(Calendar.DATE, 1)
		}

		return options
	}

	private fun updatePrice() {
		var calculatedPrice = PRICE_PER_CUPCAKE * (quantity.value ?: 0)
		if (_date.value == dateOptions[0]) {
			calculatedPrice += PRICE_FOR_SAME_DAY_PICKUP
		}
		_price.value = calculatedPrice
	}
}