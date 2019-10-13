/**
 * @format
 * @flow
 */

import React from 'react';
import {SafeAreaView, StatusBar} from 'react-native';
import MapView from './MapView';

const App: () => React$Node = () => {
  return (
    <React.Fragment>
      <StatusBar barStyle="dark-content" />
      <SafeAreaView>
        <MapView style={{height: '100%'}} zoomEnabled={false} />
      </SafeAreaView>
    </React.Fragment>
  );
};

export default App;
