/**
 * Sample React Native App
 * https://github.com/facebook/react-native
 *
 * @format
 */

import React from 'react';
import {Button, Text, View} from 'react-native';
import {NativeModules} from 'react-native';

const {CalendarModule} = NativeModules;

console.log(CalendarModule);

CalendarModule.CalendarEvent(res => console.log(res));
function App() {
  const NativeModulesPromise = async () => {
    try {
      const result = await CalendarModule.CalendarPromiseEvent();
      console.log(result);
    } catch (error) {
      console.log(error);
    }
  };

  return (
    <View style={{flex: 1}}>
      <Text>hello</Text>

      <Button 
      title='Press me'
      onPress={() => NativeModulesPromise()} />
    </View>
  );
}

export default App;
