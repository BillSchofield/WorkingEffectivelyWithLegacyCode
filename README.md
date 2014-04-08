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

#### Seams
A seam is a place where you can alter behavior in your program without editing in that place.

##### Characterization Tests
* *Characterizes* the actual behavior of the code.
* Use white box testing to identify useful input values
* Assert on the current actual results

##### Interception Points
* An interception point is simply a point in your program where you can detect the effects of a particular change. Make this as close to your change points as you can.

#### Process
* Automated Refactoring to introduce basic seams and break dependencies
* Cover with Characterization Tests and Regular Unit Tests
* Introduce seams at the change and interception points using less safe refactorings (if needed)
* TDD change

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
#### In order to make code better, we sometimes need to make some aspect of it worse.
Testable & Clear > **Testable & Muddy** > **Untestable & Clear** > Untestable & Muddy

**_When you break dependencies in legacy code, you often have to suspend your sense of aesthetics a bit. Some dependencies break cleanly; others end up looking less than ideal from a design point of view. They are like the incision point in surgery: There might be a scar left in your code after your work, but everything beneath it can get better.
If later you can cover the code around the point where you broke the dependencies, you can heal the scar too._**

#### We have to carefully balance these priorities
* New features
* Design Improvements
* Tests

## Practices
### Techniques for Breaking Dependencies
#### Parameterize Constructor
 * Inject a dependency instead of leaving it internal to a class

#### Parameterize Method
 * Inject a dependency instead of leaving it internal to a method

#### Spawn Method
 * Introduce a method and TDD that

#### Spawn Class
 * Introduce a class and TDD that

#### Break out Method Object
 * Extract method you want to change into a new class and test that

#### Subclass and Override Method
 * Test a subclass of your real class and override methods with dependencies

#### Extract and Override Call
 * Extract tough dependency and override it then test child class (**Danger!**)

#### Extract and Override Factory Method
 * Move constructor dependency to a method and override it (**Danger!**)

#### Pull up Feature
 * Pull the parts of a class you want to test into a new abstract base class then test a child of that

#### Push down Dependencies
 * Make current class abstract and push your dependencies into a child class. Test through a test child class.

#### Expose Static Method
 * Change existing method to be static (if it can be). You can test without an instance

#### Wrap Method
 * Introduce a method that contains an existing method and a call to you new method

#### Wrap Class aka Decorator
 * Wrap your hard to test class with a Decorator and TDD the decorator

#### Adapt Parameter
 * Use adapter pattern on tough dependency

#### Encapsulate Global Reference
 * Introduce new class that holds your global which it exposes with a getter

#### Introduce Instance Delegator
 * Introduce a new class that contains related global methods

#### Primitivize Parameter
 * Pass the values from an object instead of the object

#### Introduce Static Setter
 * Add a setInstance to your existing Singleton (**Danger!**)

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


