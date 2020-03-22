Llamar vistas react native desde un proyecto android estándar.

Carpetas:

stopwatch/  
Proyecto rect native, bare workflow con typescript.

StopWatch  
Proyecto creado con android estudio, crea una actividad, al presionar el botón 
se abre la actividad react native.

Antes de usar:

```
cd stopwatch
yarn install
yarn start
adb reverse tcp:8081 tcp:8081
```

En el caso del proyecto android se puede importar y lanzar desde android estudio o hacer:

```
cd StopWatch
./gradlew installDebug
```

El nombre Bridge viene de hacer un puente entre android nativo y react.
