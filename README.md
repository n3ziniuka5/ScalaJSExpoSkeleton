This is a skeleton app for developing [React Native](https://facebook.github.io/react-native/) applications on [Expo](https://expo.io) with [ScalaJS](https://www.scala-js.org/) and [SRI](https://github.com/scalajs-react-interface/sri). 

- `npm install`
- `sbt ~android:prod`. You can also do `android:dev`, but that will increase expo reload times.
- `npm run android` or `npm run ios`
- `npm start` to only start the packager

It is important to not use `SriPlatform.isAndroid` or `SriPlatform.isIOS`, because that generates different code, based on what sbt task you use. However, current react-native uses a single index file, that's why you have to use `ReactPlatform.OS`.

[SRI Docs](https://github.com/scalajs-react-interface/sri)

[Expo docs](expo.md)