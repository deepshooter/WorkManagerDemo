# WorkManagerDemo

The WorkManager API makes it easy to specify deferrable, asynchronous tasks and when they should run. These APIs let you create a task and hand it off to WorkManager to run immediately or at an appropriate time. For example, an app might need to download new resources from the network from time to time. Using these classes, you can set up a task, choose appropriate circumstances for it to run (like “only while device is charging and online”), and hand it off to WorkManager to run when the conditions are met. The task is still guaranteed to run, even if your app is force-quit or the device is rebooted.

###### Work Manger:
<p align="left">
  <img src="https://github.com/deepshooter/WorkManagerDemo/blob/master/screenshot/screen1.png" width="350"/>
</p><br /><br />


Add these dependencies in Gradle:

```gradle

    def work_version = "1.0.0-alpha10"
    implementation "android.arch.work:work-runtime:$work_version"
    // optional - Firebase JobDispatcher support
    implementation "android.arch.work:work-firebase:$work_version"
  
  ```
