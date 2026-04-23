# Problem Solve F

Hello ITSC 1213!
For today's lab, you are going to be learning about Git and Javadoc.
Most of the instructions will be on Canvas, but some will be in this here README file.

Before the start of this lab, please be sure you've installed [git](https://git-scm.com/install/).

> [!IMPORTANT]
> While this README includes a lot of information, Canvas will include numbered tasks with further instructions on what you must do.

## Task A - Clone the repository

In your ITSC 1213 labs directory, clone this repository with the following command in the terminal:
```bash
git clone https://github.com/Magnetize8953/problemsolvef.git
```

With this repository cloned, you should be able to change into its directory with the following command:
```bash
cd problemsolvef
```

## Task B - Explore the repository

Look through the files and answer the following questions:
1. What files are included in the repository?
2. When was the first commit committed?
3. What is the hash of the second commit?
4. What is the message of the most recent commit?

## Task C - Implement the linked list

As you should have found, there is an abstract class, `AQueue`, in this repository.
For this lab, you are tasked with implementing a linked list queue.
This will involve creating a class called `LinkedListQueue` which extends the aforementioned `AQueue` class.

> [!TIP]
> Take a look at the Javadoc in the `AQueue` class.

## Task D - Use your queue

This repository includes a `Main` class and method.
You can use this to test your queue.
It should run perfectly.

Once it starts to run perfectly, try your own versions.
Perhaps make a Person class and create a LinkedListQueue with Persons.


# Problem Solve G

Surprise!
This is also Problem Solve G!

As you have probably noticed, this file has changed after switching branches.
Try switching back to `main`.
You'll notice this text is gone!
This is part of the beauty of version control: you mark when things exist, and you can easily bring it in and out of existence.

In this Problem Solve, you will continue exploring Git, get a bit of exposure to non-linear data structures (don't worry, you aren't expected to fully understand them), and do some debugging.

> [!IMPORTANT]
> While this README includes a lot of information, Canvas will include numbered tasks with further instructions on what you must do.

## Task A

Take a look over this branch.
You'll notice a few new files: `BinarySearchTree.java` and `Player.java`.
You'll also see that some files have changed: `README.md` and `Main.java`.

Following the steps from Problem Solve F, generate Javadoc for these new files then answer the following questions:
1. What is the last commit the `main` and `problemsolveg` branches share?
2. What is different from the `main` and `problemsolveg` branches?
3. What methods does `BinarySearchTree` have? What do they do?
4. Do a bit of a research into binary search trees. What are they used for?
5. What does `Player` implement and how?

## Task B

Run the `main` method.
You _should_ see a randomly generated list of players ordered by health values from lowest to highest.
Is this what you see?
If not, what do you see instead?

Look back over the repo and find and fix the bug.

> [!TIP]
> The comments describe what the code _should_ be doing.
