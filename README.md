
# Bridge (Puente)

Llamar vista react native desde un proyecto android nativo, y luego llamar un módulo react nativo (desde react) para obtener el modelo del celular, luego continuar a la página nativa principal.

Carpetas:

stopwatch/  
Proyecto rect native, bare workflow con typescript.

StopWatch  
Proyecto creado con android estudio, crea una actividad, al presionar el botón se abre la actividad react native. Luego puedes llamar al módulo nativo o ir al home nativo.

Antes de usar:


Levantar el packager


```
cd /tmp
git clone https://github.com/hanspoo/Bridge
cd Bridge/stopwatch
yarn install
yarn start
```
En otro terminal levantar android. También lo pueden importar y lanzar desde android estudio o hacer:

```
cd /tmp/Bridge
cd StopWatch
adb reverse tcp:8081 tcp:8081
./gradlew installDebug
adb shell am start -n com.example.stopwatch/.MainActivity
```

El nombre Bridge viene de hacer un puente entre android nativo y react.
