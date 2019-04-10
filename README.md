WorkingEffectivelyWithLegacyCode
================================

# What is Legacy Code?
Legacy code is code without tests. -*Michael Feathers*  
A software system that the current team finds difficult to reason about and maintain. -*Bill Schofield*  

# Bill's Advice
## How do *you* deal with Legacy Code?

## What I’m going to Tell You
I’m going to show you how to use intentionality, structure, and care to improve your legacy system while adding new behavior. These ideas are based on my experience using programming techniques like those in Michael Feathers’ book.  
You will be able to more consistently improve your legacy system after this talk.

### Understand the Context of Your Legacy Code
The path that your software system took to get to the current state can inform your understanding of how to steer it in the future.  

There is virtue is how things are. They are that way for a reason. Understand those reasons before you make big changes. Especially if you aren’t certain about what to do.

### General Approach to Change
#### Steer the Team First, then Repair the Damage
Every aspect of your software system has a trajectory (position and velocity). Before we exert effort changing the position of something, we can consider whether changing the velocity first might be more effective. 

Change how your team moves forward before you start trying to “fix the problem”. In general, “the problem” is some facet of how your team is working, not that your code is in a certain structure. Steer your team to head in a healthy direction and then “repair the damage”.

The path I usually follow for this is to:

##### Steer
* Work with someone with lots of context (you could be the person with context, but I’m usually not that person) to discover an example of the pattern we want to change.
* Understand the pattern of we want to follow in the future.
* Refactor the example to follow the pattern. This creates a reference implementation for the pattern.
* Radiate information about the reference implementation and the pattern to your team.
* Get a commitment from the team about how they will work differently.
* Measure compliance to the commitment.

##### Repair
* Identify all existing examples of the pattern that we want to eliminate.
* Capture the work of remediating all of the instances you want to eliminate in your backlog. (You could decide that it makes sense to leave inconsistent code.)
* Do the work.

### The Code
#### Hygiene
We’re all adults and professionals. It’s part of our job to not leave messes that someone else needs to clean up. Hold yourself and your team accountable for this. Use static code analysis to add visibility to where your messes are. 

* Always leave a place better than your found it! *

#### Design
##### Readability is Key
We spend a lot more time reading code than writing it. That means that we get great return on investment by making our code easy to read. The Principle of Least Astonishment (or Surprise) is an important concept for making code more readable. I feel strongly that consistency is key to making our code unsurprising to read. Imagine that you are reading code and you aren’t able to tell who wrote it (maybe you wrote it). Code written the way you would write it has few surprises for you.

##### Patterns
Learn and share patterns. A team with a shared understanding of patterns will tend to write code that is flexible and easy for the team to read.

Practice and discuss patterns. Get comfortable with them so you can understand when (and when not) to use them. Knowing when to use a tool is often more important than knowing how to use it. Beware Golden Hammers.

##### Testing
Your test Pyramid is always going to take attention and the average team has many opportunities to improve how they test.

Understand your current test plan and pyramid and make them visible. 

##### Architecture
Don’t make architectural decisions based on what you are interested in or how you feel. Make those decisions based on what is best for the client and their business.

If you need to change an architectural decision, you can often use design improvements to decouple the artifacts of that decision from the rest of your software system so that executing the change is smaller and easier. 

When you make new architectural decisions, understand how you could change them in the future and how you could make it easier to change them. Can you decouple most of your code from the frameworks that your are using? Are you effectively using layers to isolate your domain from frameworks?


## Michael Feathers' Advice
### Why do we change software?
1. Add a feature - Add some behavior, hold existing behavior constant
1. Fix a bug - Change some behavior, hold other behavior constant
1. Improve design - Change code structure, hold existing behavior constant
1. Optimize resource usage - Change code to improve resource usage, hold existing behavior constant

Detecting changes in existing behavior is important!

### The Legacy Code Dilemma
When we change code, we should have tests in place. To put tests in place, we often have to change code.

### The Legacy Code Change Algorithm
1. Identify Change Points
1. Find Test Points
1. Break Dependencies
1. Write Tests
1. Make Changes and Refactor

#### How do I know that I'm not breaking anything?

##### Rules
1. Hyper-aware Editing
1. Single Goal Editing
1. Preserve Signatures
1. Lean on the Compiler
1. Pair Programming

##### Seams
A seam is a place where you can alter behavior in your program without editing in that place.

###### Characterization Tests
* *Characterizes* the actual behavior of the code.
* Use white box testing to identify useful input values
* Assert on the current actual results

###### Interception Points
* An interception point is simply a point in your program where you can detect the effects of a particular change. Make this as close to your change points as you can.

##### Process
* Automated Refactoring to introduce basic seams and break dependencies
* Cover with Characterization Tests and Regular Unit Tests
* Introduce seams at the change and interception points using less safe refactorings (if needed)
* TDD change

### Breaking Dependencies
#### Sensing & Separation

We break dependencies:
 * so we can *sense* when we can't access values our code computes
 * to *separate* when we can't even get a piece of code into a test harness to run.

##### Sensing
 * *verify*
 * getters and non-private fields

##### Separation
 * *when*
 * avoid using real resources
 * helps write maintainable tests

### Principles
##### In order to make code better, we sometimes need to make some aspect of it worse.
Testable & Clear > **Testable & Muddy** > **Untestable & Clear** > Untestable & Muddy

_When you break dependencies in legacy code, you often have to suspend your sense of aesthetics a bit. Some
dependencies break cleanly; others end up looking less than ideal from a design point of view. They are like the
incision point in surgery: There might be a scar left in your code after your work, but everything beneath it can get better._

_If later you can cover the code around the point where you broke the dependencies, you can heal the scar too._

##### We have to carefully balance these priorities
* New features
* Design Improvements
* Tests

### Practices
#### Techniques for Breaking Dependencies
##### Parameterize Constructor
 * Inject a dependency instead of leaving it internal to a class

##### Parameterize Method
 * Inject a dependency instead of leaving it internal to a method

##### Spawn Method
 * Introduce a method and TDD that

##### Spawn Class
 * Introduce a class and TDD that

##### Break out Method Object
 * Extract method you want to change into a new class and test that

##### Subclass and Override Method
 * Test a subclass of your real class and override methods with dependencies

##### Extract and Override Call
 * Extract tough dependency and override it then test child class

##### Extract and Override Factory Method (No example yet)
 * Move constructor dependency to a method and override it

##### Pull up Feature
 * Pull the parts of a class you want to test into a new abstract base class then test a child of that

##### Push down Dependencies
 * Make current class abstract and push your dependencies into a child class. Test through a test child class.

##### Expose Static Method
 * Change existing method to be static (if it can be). You can test without an instance

##### Wrap Method
 * Introduce a method that contains an existing method and a call to you new method

##### Wrap Class aka Decorator
 * Wrap your hard to test class with a Decorator and TDD the decorator

##### Adapt Parameter
 * Use adapter pattern on tough dependency

##### Encapsulate Global Reference
 * Introduce new class that holds your global which it exposes with a getter

##### Introduce Instance Delegator (No example yet)
 * Introduce a new class that contains related global methods

##### Primitivize Parameter
 * Pass the values from an object instead of the object

##### Introduce Static Setter (No example yet)
 * Add a setInstance to your existing Singleton (**Danger!**)

#### Supporting Concepts

##### Scratch Refactoring
* Refactor the code to understand it better, *then throw it away*.
* Use only automated refactorings, *then check it in*. <- Bill's version

##### Removing Duplication
* Use automated refactorings to make different code blocks identical
* Extract method or variable (IDE does the rest)
* Do example

##### Monster Methods
* Bulleted Method - indentation is not the most obvious problem
* Snarled Method - indentation makes you dizzy

##### Command/Query Separation
* Modify state or report state. Getters should be idempotent


