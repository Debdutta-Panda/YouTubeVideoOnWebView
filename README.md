# YouTubeVideoOnWebView
![image](https://user-images.githubusercontent.com/92369023/152109203-3491f70d-c3e4-4ee6-bcdb-11916bb8d764.png)

# Installation

## Project level
```
maven { url 'https://jitpack.io' }
```
## Module level
```
implementation 'com.github.Debdutta-Panda:YouTubeVideoOnWebView:<latest_version>'
```
# Usage
## Manifest
```
<uses-permission android:name="android.permission.INTERNET"/>
```
## Layout
```
<com.youtubevideoviewlibrary.YoutubeView
  android:id="@+id/yv_video"
  android:layout_width="match_parent"
  android:layout_height="200dp"/>
```
## Activity
```
yv_video?.setVideo(true,"https://www.youtube.com/embed/e1C5WIfZ89s", startTime = "600")
```
```
override fun onResume() {
        super.onResume()
        yv_video?.exitFullScreen()
    }
```
