# Summary of the projects

The course is divided into six units. This summary presents all the concepts explored in each project and the resources used, organized by unit.

## Unit 1: Kotlin basics

### [Happy Birthday](HappyBirthday/)

*From the "Build a basic layout" codelab*

<img src="https://raw.githubusercontent.com/amoralesc/android-basics-kotlin/main/screenshots/happy_birthday_1.png" width="200">

Really simple project. It's a single activity - single screen app that displays a birthday message.

#### Concepts explored

- Basic layouts: ConstraintLayout
- Basic views: ImageView, TextView 

### [Dice Roller](DiceRoller/)

*From the "Add a button to an app" section*

<img src="https://raw.githubusercontent.com/amoralesc/android-basics-kotlin/main/screenshots/dice_roller_1.png" width="200">

Simple project. It's a single activity - single screen app that displays a dice (image) that can be rolled with a button. 

#### Concepts explored

- Previous concepts
- Basic interactive views: Button
- Basic unit testing: using JUnit
- The button is programmed in a simple way: it calls a method that updates the image displayed.

### [Lemonade App](android-basics-kotlin-lemonade-app-main/)

*From the "Project: Lemonade App" codelab*

<div style="float: left">
  <img src="https://raw.githubusercontent.com/amoralesc/android-basics-kotlin/main/screenshots/lemonade_app_1.png" width="200">
  <img src="https://raw.githubusercontent.com/amoralesc/android-basics-kotlin/main/screenshots/lemonade_app_2.png" width="200">
</div>
  
Simple project with states. It's a single activity - single screen app that displays the interactive process of making lemonade. It does so by introducing states. According to the current state of the app, a different image is displayed.

#### Concepts explored

- Previous concepts
- Basic states using class variables (not recommended)
- Snackbar (hideable pop-up shown at the bottom of screen)

## Unit 2: Layouts

### [Tip Time](TipTime/)

*From the "Get user input in an app: Part 1" and "Get user input in an app: Part 2" sections*

<img src="https://raw.githubusercontent.com/amoralesc/android-basics-kotlin/main/screenshots/tip_time_1.png" width="200">

Simple project. It's a single activity - single screen app that acts as a tip calculator. It asks the user for mulitple inputs, and then displays the calculated tip. It also introduces themes and styles.

#### Concepts explored

- Previous concepts
- Basic interactive input views: EditText (material design) and RadioGroup / RadioButton
- View binding (and the binding object) for a better connected UI (replaces findViewById). One-way connection from the data to the UI.
- Themes and styles customization with material design concepts (custom EditText, icons with theme colors, etc.)

### [Affirmations](Affirmations/)

*From the "Display a scrollable list" section*

<img src="https://raw.githubusercontent.com/amoralesc/android-basics-kotlin/main/screenshots/affirmations_1.png" width="200">

Simple project. It's a single activity - single screen app that display a list of affirmations using a RecyclerView. It uses cards to display multiple elements inside the same item.

#### Concepts explored

- Previous concepts
- Advanced views: RecyclerView. It's an optimized view for displaying a list of elements dynamically.
- The implementation of the RecyclerView is done through a custom adapter class. The view holder is also implemented. On a later project, layout manager is introduced and a common adapter (DiffUtil) is used.
- Card views that allow for multiple view elements (image, text) inside the same item.
- Basic Instrumentation Testing: using Espresso

### [Dogglers App](android-basics-kotlin-dogglers-app-main/)

*From the "Project: Dogglers App" codelab*

<div style="float: left">
  <img src="https://raw.githubusercontent.com/amoralesc/android-basics-kotlin/main/screenshots/dogglers_1.png" width="200">
  <img src="https://raw.githubusercontent.com/amoralesc/android-basics-kotlin/main/screenshots/dogglers_2.png" width="200">
</div>

Simple project. It's a multiple activities - multiple screen app that displays a list of dogs using a RecyclerView. It introduces activity to activity navigation.

#### Concepts explored

- Previous concepts
- RecyclerView with custom adapter, custom view holder, and using layout managers. It can display the list linearly (vertical or horizontal) or in a grid.
- Activity to activity navigation using explicit intents (not recommended, use fragments instead).

## Unit 3: Navigation

### [Words](android-basics-kotlin-words-app-activities/)

*From the "Navigate between screens" and "Introduction to the Navigation component" sections*

<div style="float: left">
  <img src="https://raw.githubusercontent.com/amoralesc/android-basics-kotlin/main/screenshots/words_1.png" width="200">
  <img src="https://raw.githubusercontent.com/amoralesc/android-basics-kotlin/main/screenshots/words_2.png" width="200">
</div>

Medium project. It's a single activity - multiple fragments - multiple screens app. A letter is chosen to see a list of random words. A word can then be chosen to launch an implicit intent to open the word in a browser.

#### Concepts explored

- Previous concepts
- Navigation between fragments using the Jetpack navigation component
- The navigation uses an XML resource file to define the navigation graph. The app then uses the NavController to navigate between the fragments.
- Introduces implicit intents to do stuff using the other apps of the android device

### [Unscramble](android-basics-kotlin-unscramble-app-starter/)

*From the "Architecture components" section*

<div style="float: left">
  <img src="https://raw.githubusercontent.com/amoralesc/android-basics-kotlin/main/screenshots/unscramble_1.png" width="200">
  <img src="https://raw.githubusercontent.com/amoralesc/android-basics-kotlin/main/screenshots/unscramble_2.png" width="200">
</div>

Medium project. It's a single activity - single fragment - single screen app. It's a game where the user has to unscramble a word. It introduces the ViewModel and LiveData concepts for app architecture.

#### Concepts explored

- Previous concepts
- ViewModel (linked to a fragment) to retain app data that survives configuration changes. Also passes the business logic to the ViewModel and leaves the user interaction to the UI.
- LiveData to create observable data. Changes in the UI are notified to the observers and performed without user interaction.
- Data binding in favor of view binding for a two-way connection between the UI and the ViewModel. Changes by the user are reflected in the ViewModel and vice-versa.
- Simple dialogs to display messages to the user.

### [Cupcake App](android-basics-kotlin-cupcake-app-starter/)

*From the "Advanced navigation app examples" section*

<div style="float: left">
  <img src="https://raw.githubusercontent.com/amoralesc/android-basics-kotlin/main/screenshots/cupcake_app_1.png" width="200">
  <img src="https://raw.githubusercontent.com/amoralesc/android-basics-kotlin/main/screenshots/cupcake_app_2.png" width="200">
  <img src="https://raw.githubusercontent.com/amoralesc/android-basics-kotlin/main/screenshots/cupcake_app_3.png" width="200">
</div>

Medium project. It's a single activity - multiple fragments - multiple screens app that acts as a cupcake store. It has a bunch of screens displaying different input elements. It introduces advanced navigation techniques and the backstack.

#### Concepts explored

- Previous concepts
- ViewModel (linked to an activity) that retains app data through multiple fragments.
- Navigation components between fragments, cancel buttons that return to the starter screen.
- Implicit intent to send text object to another app.

### [Lunch Tray App](android-basics-kotlin-lunch-tray-app-main/)

**Not building, needs to be fixed**

*From the "Project: Lunch Tray App" codelab*

Medium project. It's a single activity - multiple fragments - multiple screens app that acts as a lunch ordering app. It has a bunch of screens displaying different input elements (entree, side, accompaniment and a summary of the order).

#### Concepts explored

- Previous concepts
- Very similar to the Cupcake App
