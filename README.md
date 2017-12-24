# LiveMVVM

[![Author](https://img.shields.io/badge/author-mindjet-yellow.svg)](https://github.com/Mindjet) [![](https://jitpack.io/v/Mindjet/LiveMVVM.svg)](https://jitpack.io/#Mindjet/LiveMVVM)

<img src="./art/LiveMVVM.png" width="600"/>

## Intro

LiveMVVM is light weight MVVM framework for Android. It's coded with Kotlin mostly.

Based on the Google's [android-architecture](https://developer.android.com/topic/libraries/architecture/index.html), this library provides lifecycle-aware components, like `ViewModel` and `LiveData`. And of course, I have made some encapsulation to get these components easier to use.

## Usage

In your top-level `build.gradle`:

```groovy
repositories {
  ...
	maven { url 'https://jitpack.io' }
}
```

And in your module-level `build.gradle`:

```groovy
implementation 'com.github.Mindjet:LiveMVVM:x.y.z'		//gralde 4.x
//or
compile 'com.github.Mindjet:LiveMVVM:x.y.z'		//gradle 3.x
```

Last but not least, add `android-architecture` library to your module:

```groovy
implementation "android.arch.lifecycle:runtime:1.0.0"
implementation "android.arch.lifecycle:extensions:1.0.0-alpha9-1"
annotationProcessor "android.arch.lifecycle:compiler:1.0.0-alpha9-1"
```

## How2Use

Talking about MVVM, no doubt we have to encounter Model, View and ViewModel. I have made a clear line between these components.

### Model

In order to use LiveMVVM, your Model is supposed to the class named `BaseModel`.

### View

The typical View is an `Activity`.  Your Activity is supposed to inherit the class named `BaseActivity`, which inherits `AppCompatActivity`. 

### ViewModel

The ViewModel is to handle states of the View and response the event from it. Technically, your ViewModel is supposed to inherit `BaseViewModel`.

## License

```
MIT License

Copyright (c) 2017 郑颖铎

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
```

