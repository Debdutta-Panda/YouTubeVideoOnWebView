# YouTubeVideoOnWebView
![image](https://user-images.githubusercontent.com/92369023/151947600-3296c393-8227-4d00-9a13-2d5ddbfba81e.png)

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
```
<com.youtubevideoviewlibrary.YoutubeView
  android:id="@+id/yv_video"
  android:layout_width="match_parent"/>
```
```
yv_video?.setVideo(true,"https://www.youtube.com/embed/e1C5WIfZ89s", startTime = "600")
```
