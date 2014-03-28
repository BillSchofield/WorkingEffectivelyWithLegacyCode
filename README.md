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

## Practices
### Seams
A seam is a place where you can alter behavior in your program without editing in that place.

#### Introducing a Seam
Validate that the file to be printed actually exists and throw a Runtime exception if it does not.

#### Techniques
 * Spawn Method
 * Spawn Class
 * Wrap Method
 * Wrap Class aka Decorator
 * Adapt Parameter
 * Break out Method Object
 * Encapsulate Global Reference
 * Introduce Instance Delegator
 * Expose Static Method
 * Introduce Static Setter (**Danger!**)


####  Inheritance Techniques
 * Extract and Override Call (**Danger!**)
 * Extract and Override Factory Method (**Danger!**)
 * Extract and Override Getter (**Danger!**)
 * Extract Implementer (**Danger!**)
 * Extract Interface (**Danger!**)

### Supporting Techniques

#### Scratch Refactoring (p.212)
* Refactor the code to understand it better, *then throw it away*.
* Use only automated refactorings, *then check it in*. <- Bill's version

#### Removing Duplication (p.275)
* Use automated refactorings to make different code blocks identical
* Extract method or variable (IDE does the rest)

#### Monster Methods (p.289)
* Bulleted Method - indentation is not the most obvious problem
* Snarled Method - indentation makes you dizzy


Dependency Inversion p.84
Command/Query Separation p.147
Feature sketches p.252
* Add sample code


