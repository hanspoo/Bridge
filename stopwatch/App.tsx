import React, { useState } from "react";
import { NativeModules, Button } from "react-native";
import { StyleSheet, Text, View } from "react-native";

export default function App() {
  const [name, setName] = useState("?");

  console.log(NativeModules);
  const cargarName = () =>
    NativeModules.Device.getDeviceName((error, name) => {
      if (error) setName(`Error ${error}`);
      else setName(name);
    });
  return (
    <View style={styles.container}>
      <Text style={{ fontWeight: "bold" }}>Bienvenido a React!</Text>
      <Text>Vamos a consultar el modelo del dispositivo</Text>
      <Text>usando un módulo nativo</Text>
      <View style={{ marginTop: 14, marginBottom: 14 }}>
        <Button title="Ver modelo de dispositivo" onPress={cargarName} />
      </View>

      <Text>Modelo es: {name}</Text>
    </View>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: "#fff",
    alignItems: "center",
    justifyContent: "center"
  }
});
