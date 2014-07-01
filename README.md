# Data structures in Java

This is a place where students can begin to learn the basics of 
data structure written in Java.

It is based off the "[Algorithms, 4th Edition website](http://algs4.cs.princeton.edu/)".

## Mission

Implement the queue and the stack abstract data types in Java based on the code
for that was implemented for the Bag ADT in class. Use good test driven development
flow to help with the development of these data structures.

For the queue, you will implement the following methods:

* constructor that takes no arguments and creates an empty queue
* enqueue(item) - adds an item to the end of queue
* dequeue - returns an item from the front of queue
* isEmpty - tells you if the queue is empty or not
* size - tells you how many items are in the queue

For the stack, you will implement the following methods:

* constructor that takes no arguments and creates an empty stack
* push(item) - adds an item to the stack
* pop - returns an item from the stack
* isEmpty - tells you if the stack is empty or not
* size - tells you how many items are in the stack

# Extra

## Iteration

Implement the [Iterable](http://docs.oracle.com/javase/8/docs/api/java/lang/Iterable.html) interface.
The iterator should return the elements in the order that they would be dequeued/popped from
their respective data structures.

## Using a Linked List

If you implemented these data structures using an array internally, re-implement 
using a linked list internally. Also try it without using the built 
in [LinkedList](http://docs.oracle.com/javase/8/docs/api/java/util/LinkedList.html)
class from Java.

# Setup

* Install a [Java 8 development environment](https://github.com/gSchool/setting-up-java8-environment/blob/master/README.md)
* Fork
* Clone
* Generate the IntelliJ project files using `gradle idea`.
* Turn on TravisCI for the fork by
  visiting https://travis-ci.org/profile/<github user name>, clicking the "Sync now" button
  and scrolling down to find the repository to build.
* Create a new branch for your work using `git checkout -b v1`
* Implement specs and code. To run the tests, use `gradle test` or run them 
from within IntelliJ.
* Push using `git push -u origin v1`

## Further Practice

This warmup can be completed multiple times to increase your comfort level with the material.
To work on this from scratch, you can:

1. Add an upstream remote that points to the original repo `git remote add upstream git@github.com:gSchool/data-structures-java.git`
1. Fetch the latest from the upstream remote using `git fetch upstream`
1. Create a new branch from the master branch of the upstream remote `git checkout -b v2 upstream/master`
1. Implement specs and code
1. Push using `git push -u origin v2`

Each time you do the exercise, create a new branch. For example the 3rd time you do the exercise the branch
name will be v3 instead of v2.
