.PHONY: build install run deploy clean logcat

# Variables
PACKAGE = dev.ceccpro.neomusic
ACTIVITY = .MainActivity
APK_PATH = app/build/outputs/apk/debug/app-debug.apk

## Compila el APK de debug
build:
	./gradlew assembleDebug

## Instala el APK en el dispositivo conectado por USB
install:
	adb install -r $(APK_PATH)

## Ejecuta la aplicación en el dispositivo
run:
	adb shell am start -n $(PACKAGE)/$(ACTIVITY)

## Compila, instala y ejecuta la aplicación (Todo en uno)
deploy: build install run

## Limpia el proyecto
clean:
	./gradlew clean

## Muestra los logs de la aplicación usando logcat
logcat:
	adb logcat --pid=`adb shell pidof -s $(PACKAGE)`
