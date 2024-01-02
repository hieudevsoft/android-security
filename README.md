### Step 1. Add the JitPack repository to your build file
dependencyResolutionManagement {\
&nbsp;&nbsp;&nbsp;&nbsp;repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)\
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;repositories {\
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;mavenCentral()\
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;maven { url 'https://jitpack.io' }\
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\}\
}
### Step 2. Add the dependency
dependencies {\
&nbsp;&nbsp;&nbsp;&nbsp;implementation 'com.github.hieudevsoft:android-security:Tag'\
}