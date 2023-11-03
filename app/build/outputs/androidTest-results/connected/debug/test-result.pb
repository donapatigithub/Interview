
ê?
^
ExampleInstrumentedTestcom.example.interviewtestLoginSuccess2™Â’ªÀ”ðƒ:›Â’ªÀØ‘¬Ä:
äcom.google.android.apps.common.testing.accessibility.framework.integrations.espresso.AccessibilityViewCheckException: There were 2 accessibility results:
AppCompatTextView{id=2131231158, res-name=register, desc=Double tap to register as new user, visibility=VISIBLE, width=996, height=51, has-focus=false, has-focusable=true, has-window-focus=false, is-clickable=true, is-enabled=true, is-focused=false, is-focusable=true, is-layout-requested=false, is-selected=false, layout-params=android.widget.RelativeLayout$LayoutParams@YYYYYY, tag=null, root-is-layout-requested=false, has-input-connection=false, x=42.0, y=1076.0, text=New to goCart? Create an account, input-type=0, ime-target=false, has-links=false}: This item's height is 19dp. Consider making the height of this touch target 48dp or larger. Reported by com.google.android.apps.common.testing.accessibility.framework.checks.TouchTargetSizeCheck,
AppCompatEditText{id=2131231292, res-name=userid, desc=Enter User Id, visibility=VISIBLE, width=944, height=143, has-focus=true, has-focusable=true, has-window-focus=false, is-clickable=true, is-enabled=true, is-focused=true, is-focusable=true, is-layout-requested=false, is-selected=false, layout-params=android.widget.RelativeLayout$LayoutParams@YYYYYY, tag=null, root-is-layout-requested=false, has-input-connection=true, editor-info=[inputType=0x21 imeOptions=0x8000005 privateImeOptions=null actionLabel=null actionId=0 initialSelStart=0 initialSelEnd=0 initialCapsMode=0x0 hintText=User Id label=null packageName=null autofillId=null fieldId=0 fieldName=null extras=Bundle[{android.support.text.emoji.emojiCompat_metadataVersion=9, android.support.text.emoji.emojiCompat_replaceAll=false}] hintLocales=null contentMimeTypes=null ], x=68.0, y=709.0, text=, hint=User Id, input-type=33, ime-target=true, has-links=false}: This editable TextView has an android:contentDescription. A screen reader may read this attribute instead of the editable content when the user is navigating. Reported by com.google.android.apps.common.testing.accessibility.framework.checks.EditableContentDescCheck
at com.google.android.apps.common.testing.accessibility.framework.integrations.espresso.AccessibilityValidator.processResults(AccessibilityValidator.java:272)
at com.google.android.apps.common.testing.accessibility.framework.integrations.espresso.AccessibilityValidator.runAccessibilityChecks(AccessibilityValidator.java:228)
at com.google.android.apps.common.testing.accessibility.framework.integrations.espresso.AccessibilityValidator.checkAndReturnResults(AccessibilityValidator.java:87)
at androidx.test.espresso.accessibility.AccessibilityChecks$2.check(AccessibilityChecks.java:65)
at androidx.test.espresso.action.ViewActions$1.perform(ViewActions.java:3)
at androidx.test.espresso.ViewInteraction$SingleExecutionViewAction.perform(ViewInteraction.java:2)
at androidx.test.espresso.ViewInteraction.doPerform(ViewInteraction.java:25)
at androidx.test.espresso.ViewInteraction.-$$Nest$mdoPerform(Unknown Source:0)
at androidx.test.espresso.ViewInteraction$1.call(ViewInteraction.java:7)
at androidx.test.espresso.ViewInteraction$1.call(ViewInteraction.java:1)
at java.util.concurrent.FutureTask.run(FutureTask.java:264)
at android.os.Handler.handleCallback(Handler.java:942)
at android.os.Handler.dispatchMessage(Handler.java:99)
at android.os.Looper.loopOnce(Looper.java:226)
at android.os.Looper.loop(Looper.java:313)
at android.app.ActivityThread.main(ActivityThread.java:8762)
at java.lang.reflect.Method.invoke(Native Method)
at com.android.internal.os.RuntimeInit$MethodAndArgsCaller.run(RuntimeInit.java:604)
at com.android.internal.os.ZygoteInit.main(ZygoteInit.java:1067)tcom.google.android.apps.common.testing.accessibility.framework.integrations.espresso.AccessibilityViewCheckExceptionäcom.google.android.apps.common.testing.accessibility.framework.integrations.espresso.AccessibilityViewCheckException: There were 2 accessibility results:
AppCompatTextView{id=2131231158, res-name=register, desc=Double tap to register as new user, visibility=VISIBLE, width=996, height=51, has-focus=false, has-focusable=true, has-window-focus=false, is-clickable=true, is-enabled=true, is-focused=false, is-focusable=true, is-layout-requested=false, is-selected=false, layout-params=android.widget.RelativeLayout$LayoutParams@YYYYYY, tag=null, root-is-layout-requested=false, has-input-connection=false, x=42.0, y=1076.0, text=New to goCart? Create an account, input-type=0, ime-target=false, has-links=false}: This item's height is 19dp. Consider making the height of this touch target 48dp or larger. Reported by com.google.android.apps.common.testing.accessibility.framework.checks.TouchTargetSizeCheck,
AppCompatEditText{id=2131231292, res-name=userid, desc=Enter User Id, visibility=VISIBLE, width=944, height=143, has-focus=true, has-focusable=true, has-window-focus=false, is-clickable=true, is-enabled=true, is-focused=true, is-focusable=true, is-layout-requested=false, is-selected=false, layout-params=android.widget.RelativeLayout$LayoutParams@YYYYYY, tag=null, root-is-layout-requested=false, has-input-connection=true, editor-info=[inputType=0x21 imeOptions=0x8000005 privateImeOptions=null actionLabel=null actionId=0 initialSelStart=0 initialSelEnd=0 initialCapsMode=0x0 hintText=User Id label=null packageName=null autofillId=null fieldId=0 fieldName=null extras=Bundle[{android.support.text.emoji.emojiCompat_metadataVersion=9, android.support.text.emoji.emojiCompat_replaceAll=false}] hintLocales=null contentMimeTypes=null ], x=68.0, y=709.0, text=, hint=User Id, input-type=33, ime-target=true, has-links=false}: This editable TextView has an android:contentDescription. A screen reader may read this attribute instead of the editable content when the user is navigating. Reported by com.google.android.apps.common.testing.accessibility.framework.checks.EditableContentDescCheck
at com.google.android.apps.common.testing.accessibility.framework.integrations.espresso.AccessibilityValidator.processResults(AccessibilityValidator.java:272)
at com.google.android.apps.common.testing.accessibility.framework.integrations.espresso.AccessibilityValidator.runAccessibilityChecks(AccessibilityValidator.java:228)
at com.google.android.apps.common.testing.accessibility.framework.integrations.espresso.AccessibilityValidator.checkAndReturnResults(AccessibilityValidator.java:87)
at androidx.test.espresso.accessibility.AccessibilityChecks$2.check(AccessibilityChecks.java:65)
at androidx.test.espresso.action.ViewActions$1.perform(ViewActions.java:3)
at androidx.test.espresso.ViewInteraction$SingleExecutionViewAction.perform(ViewInteraction.java:2)
at androidx.test.espresso.ViewInteraction.doPerform(ViewInteraction.java:25)
at androidx.test.espresso.ViewInteraction.-$$Nest$mdoPerform(Unknown Source:0)
at androidx.test.espresso.ViewInteraction$1.call(ViewInteraction.java:7)
at androidx.test.espresso.ViewInteraction$1.call(ViewInteraction.java:1)
at java.util.concurrent.FutureTask.run(FutureTask.java:264)
at android.os.Handler.handleCallback(Handler.java:942)
at android.os.Handler.dispatchMessage(Handler.java:99)
at android.os.Looper.loopOnce(Looper.java:226)
at android.os.Looper.loop(Looper.java:313)
at android.app.ActivityThread.main(ActivityThread.java:8762)
at java.lang.reflect.Method.invoke(Native Method)
at com.android.internal.os.RuntimeInit$MethodAndArgsCaller.run(RuntimeInit.java:604)
at com.android.internal.os.ZygoteInit.main(ZygoteInit.java:1067)"·

logcatandroid¡
žC:\And\Interview\app\build\outputs\androidTest-results\connected\debug\SM-A525F - 13\logcat-com.example.interview.ExampleInstrumentedTest-testLoginSuccess.txt"

device-infoandroide
cC:\And\Interview\app\build\outputs\androidTest-results\connected\debug\SM-A525F - 13\device-info.pb"€

device-info.meminfoandroid^
\C:\And\Interview\app\build\outputs\androidTest-results\connected\debug\SM-A525F - 13\meminfo"€

device-info.cpuinfoandroid^
\C:\And\Interview\app\build\outputs\androidTest-results\connected\debug\SM-A525F - 13\cpuinfo" *ä
c
test-results.logOcom.google.testing.platform.runtime.android.driver.AndroidInstrumentationDrivero
mC:\And\Interview\app\build\outputs\androidTest-results\connected\debug\SM-A525F - 13\testlog\test-results.log 2
text/plain