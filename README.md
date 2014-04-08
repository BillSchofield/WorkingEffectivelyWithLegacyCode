WorkingEffectivelyWithLegacyCode
================================

## Why do we change software?
1. Add a feature - Add some behavior, hold existing behavior constant
1. Fix a bug - Change some behavior, hold other behavior constant
1. Improve design - Change code structure, hold existing behavior constant
1. Optimize resource usage - Change code to improve resource usage, hold existing behavior constant

Detecting changes in existing behavior is important!

# Legacy Code
Legacy code is code without tests. -- *Michael Feathers*

## The Legacy Code Dilemma
When we change code, we should have tests in place. To put tests in place, we often have to change code.

## The Legacy Code Change Algorithm
1. Identify Change Points
1. Find Test Points
1. Break Dependencies
1. Write Tests
1. Make Changes and Refactor

### How do I know that I'm not breaking anything?

#### Rules
1. Hyper-aware Editing
1. Single Goal Editing
1. Preserve Signatures
1. Lean on the Compiler
1. Pair Programming

#### Process
* Automated Refactoring to introduce basic seams and break dependencies
* Cover with Characterization Tests and Regular Unit Tests
* Introduce seams at the change and interception points using less safe refactorings (if needed)
* TDD change

##### Characterization Tests (p.186)
* *Characterizes* the actual behavior of the code.
* Use white box testing to identify useful input values
* Assert on the current actual results

##### Interception Points (p.174)
* An interception point is simply a point in your program where you can detect the effects of a particular change. Make this as close to your change points as you can.

## Breaking Dependencies
### Sensing & Separation

We break dependencies:
 * so we can *sense* when we can't access values our code computes
 * to *separate* when we can't even get a piece of code into a test harness to run.

#### Sensing
 * *verify*
 * getters and non-private fields

#### Separation
 * *when*
 * avoid using real resources
 * helps write maintainable tests

## Principles
### In order to make code better, we sometimes need to make some aspect of it worse.

Tested & Testable & Clear > **Untested & Testable & Muddy** > **Untested & Untestable & Clear** > Untested & Untestable & Muddy

## Practices
### Seams
A seam is a place where you can alter behavior in your program without editing in that place.

#### Introducing a Seam
Validate that the file to be printed actually exists and throw a Runtime exception if it does not.

### Techniques for Breaking Dependencies
#### Inject Dependency
 * Not in the book. You'll love this one.

#### Spawn Method
 * Introduce a method and TDD that

#### Spawn Class
 * Introduce a class and TDD that

#### Wrap Method
 * Introduce a method that contains an existing method and a call to you new method

#### Wrap Class aka Decorator
 * Wrap your hard to test class with a Decorator and TDD the decorator

#### Adapt Parameter
 * Use adapter pattern on tough dependency

#### Break out Method Object
 * Extract method you want to change into a new class and test that

#### Encapsulate Global Reference
 * Introduce new class that holds your global which it exposes with a getter

#### Introduce Instance Delegator
 * Introduce a new class that contains related global methods

#### Expose Static Method
 * Change existing method to be static (if it can be). You can test without an instance

#### Introduce Static Setter
 * Add a setInstance to your existing Singleton (**Danger!**)

#### Extract and Override Call
 * Extract tough dependency and override it then test child class (**Danger!**)

#### Extract and Override Factory Method
 * Move constructor dependency to a method and override it (**Danger!**)

### Supporting Concepts

#### Scratch Refactoring
* Refactor the code to understand it better, *then throw it away*.
* Use only automated refactorings, *then check it in*. <- Bill's version

#### Removing Duplication
* Use automated refactorings to make different code blocks identical
* Extract method or variable (IDE does the rest)
* Do example

#### Monster Methods
* Bulleted Method - indentation is not the most obvious problem
* Snarled Method - indentation makes you dizzy

#### Command/Query Separation
* Modify state or report state. Getters should be idempotent


