# LiveMVVM

[![Author](https://img.shields.io/badge/author-mindjet-yellow.svg)](https://github.com/Mindjet)

<img src="./art/LiveMVVM.png" width="300"/>

## Intro

LiveMVVM is light weight MVVM framework for Android. It's coded with Kotlin mostly.

Based on the Google's [android-architecture](https://developer.android.com/topic/libraries/architecture/index.html), this library provides lifecycle-aware components, like `ViewModel` and `LiveData`. And of course, I have made some encapsulation to get these components easier to use.

## Usage

Talking about MVVM, no doubt we have to encounter Model, View and ViewModel. I have made a clear line between these components.

### Model

In order to use LiveMVVM, your Model is supposed to the class named `BaseModel`.

### View

The typical View is an `Activity`.  Your Activity is supposed to inherit the class named `BaseLiveActivity`, which inherits `AppCompatActivity`. 

### ViewModel

The ViewModel is to handle states of the View and response the event from it. Technically, your ViewModel is supposed to inherit `BaseViewModel`.

## License

