This repository explains how RobotCoder works and what it does.

__RobotCoder__

Robotcoder is a tool that tells you when you're accidentally using Android UI thread to access disk or network. When you create a PR our bot will analyze it and adds a comment if there is such an access. It's a 10x better replacement to Android Strict Mode

In practice, this means less ANR in production, a faster app and more efficient engineers.

__Why?__

Compared to Android Strict Mode, Robotcoder is better because

- **Less performance problem in production**. We catch these issues when the PR is pushed. Strict Mode will catch them when the app is in testing 
- **we attribute the violation to a line of code in a PR**. We tell you which line of code is creating the problem and why. Strict Mode can only warn you of problems not who should fix them
- **It's always on**. With Strict Mode, you need to run the app. This means we will surface problem continuously without engineers time
- **We find more problems than StrictMode** because we explore all paths (including different Android version) automatically. Strict Mode only explores the parts of the app you navigate to.
- **Faster problem resolution**. Our user tests shows that when telling an engineer about an issue she just introduced, she will fix it. Strict Mode doesn't work like that
- **No false positives**. Strict Mode logs are full of false positive. For instance, inflating a layout will trigger a StrictMode warning. But this is the only way to do it. 

__Demo__

- A [really obvious problem caught by RobotCoder](https://github.com/manycore-com/demo-anr-detection/pull/1)
- A ["slightly less obvious" problem](https://github.com/manycore-com/demo-anr-detection/pull/2)
- A [really not obvious problem for non Glide users!](https://github.com/manycore-com/demo-anr-detection/pull/3)

__Sign Up__

We're free for public repositories. 
25$/month/user for closed repositories. 
You can sign up on http://www.robotcoder.net. 

__Who__

It's a project written by [Nicolas Toper](mailto:ntoper@manycore.io) and [Marcus Engene](mailto:marcus@manycore.io). We're always eager to hear from potential users. Please email us!
