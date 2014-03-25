WorkingEffectivelyWithLegacyCode
================================

# Legacy Code

## The Legacy Code Dilemma
When we change code, we should have tests in place. To put tests in place, we often have to change code.

## Why do we change software?
1. Add a feature - Add some behavior, hold existing behavior constant
1. Fix a bug - Change some behavior, hold other behavior constant
1. Improve design - Change code structure, hold existing behavior constant
1. Optimize resource usage - Change code to improve resource usage, hold existing behavior constant

Detecting changes in existing behavior is important



## The Legacy Code Change Algorithm
1. Identify Change Points
1. Find Test Points
1. Break Dependencies
1. Write Tests
1. Make Changes and Refactor




# Breaking Dependencies
## Sensing & Separation

We break dependencies:
 * so we can *sense* when we can't access values our code computes
 * to *separate* when we can't even get a piece of code into a test harness to run.

### Sensing
 * *verify*
 * getters and non-private fields

### Separation
 * *when*
 * avoid using real resources
 * helps write maintainable tests


Dependency Inversion p.84
Command/Query Separation p.147
Interception Points p.174
* An interception point is simply a point in your program where you can detect the effects of a particular change. Make this as close to your change points as you can.
Characterization Tests p.186
* *Characterizes* the actual behavior of the code.
Scratch Refactoring p.212
* Refactor the code to understand it better, *then throw it away*.
* Use only automated refactorings, *then check it in*. <- Bill's version
Feature sketches p.252
* Add sample code
Removing Duplication p.275
* Use automated refactorings to make different code blocks identical
* extract method or variable (IDE does the rest)
Monster Methods p.289
* Bulleted Method - indentation is not the most obvious problem
* Snarled Method - indentation makes you dizzy

## How the heck do I make a change safely?
* Automated Refactoring to introduce basic seams and break dependencies
* Cover with Characterization Tests
* Introduce seams at the change and interception points using less safe refactorings (if needed)
* TDD change

Seam
Introducing a Seam
Validate that the file to be printed actually exists and throw a Runtime exception that you create if it doesn’t.
Spawn Method
Spawn Class
Wrap Method
Wrap Class/Decorator
