# Java JDK Installation Guide

To compile and run the Java programs in this repository, you need to have the Java Development Kit (JDK) installed on your system. Follow these instructions to set it up.

---

## 📥 Step 1: Download and Install JDK

We recommend using **JDK 17 LTS** or **JDK 21 LTS**.

1. Visit the official [Oracle JDK Downloads](https://www.oracle.com/java/technologies/downloads/) or [Adoptium Temurin OpenJDK](https://adoptium.net/).
2. Select your Operating System (Windows, macOS, or Linux).
3. Download the installer (e.g., `.msi` or `.exe` for Windows, `.pkg` for macOS).
4. Run the installer and follow the default prompts.

---

## ⚙️ Step 2: Configure Environment Variables

### Windows
1. Open the Start Search, type **"environment variables"**, and select **"Edit the system environment variables"**.
2. Click **"Environment Variables..."** at the bottom right.
3. Under **System Variables**, click **"New..."** to add `JAVA_HOME`:
   - **Variable name**: `JAVA_HOME`
   - **Variable value**: The path where your JDK was installed (e.g., `C:\Program Files\Java\jdk-21`).
4. Locate the **Path** variable under **System Variables**, select it, and click **"Edit..."**.
5. Click **"New"** and add: `%JAVA_HOME%\bin`.
6. Click **OK** to save and close all windows.

### macOS & Linux
Add the following lines to your shell profile file (e.g., `~/.zshrc`, `~/.bash_profile`, or `~/.bashrc`):
```bash
export JAVA_HOME=$(/usr/libexec/java_home)
export PATH=$JAVA_HOME/bin:$PATH
```
Then, reload the shell configuration:
```bash
source ~/.zshrc
```

---

## 🔍 Step 3: Verify Installation

Open a **new** terminal or command prompt window and run:

```bash
java -version
javac -version
```

If configured correctly, these commands will output the version details of your installed JDK.

---

## 🚀 Step 4: Compiling & Running Programs

To compile and run any `.java` file in this repository:

1. Open your terminal at the root of this project.
2. Compile the source file:
   ```bash
   javac Arrays/Binary_search.java
   ```
3. Run the compiled class:
   ```bash
   java Arrays.Main
   ```
