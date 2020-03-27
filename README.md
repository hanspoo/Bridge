
# Bridge (Puente)

POC, llamar vista react native desde un proyecto android nativo, y luego llamar un módulo react nativo para obtener el modelo del celular, y de la página react ir a la actividad principal.

Carpetas:

stopwatch/  
Proyecto rect native, bare workflow con typescript.

StopWatch  
Proyecto creado con android estudio, crea una actividad, al presionar el botón se abre la actividad react native. Luego puedes llamar al módulo nativo o ir al home nativo.

Antes de usar:

git clone https://github.com/hanspoo/Bridge


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
