var scalajsOut = require("./assets/js/scalajs-output-android.js");

import React from 'react';

export default class App extends React.Component {
  render() {
    return (
      <scalajsOut.MyAppRoot></scalajsOut.MyAppRoot>
    )
  }
}
