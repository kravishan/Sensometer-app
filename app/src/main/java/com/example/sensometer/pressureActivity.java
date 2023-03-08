package com.example.sensometer;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.widget.TextView;

public class pressureActivity extends Activity implements SensorEventListener {

    private SensorManager sensorManager;
    private Sensor pressureSensor;
    private TextView pressureSensorText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pressure);

        sensorManager = (SensorManager) getSystemService(Context.SENSOR_SERVICE);
        pressureSensor = sensorManager.getDefaultSensor(Sensor.TYPE_PRESSURE);

        pressureSensorText = (TextView) findViewById(R.id.pressureSensorText);
    }

    @Override
    protected void onResume() {
        super.onResume();
        sensorManager.registerListener(this, pressureSensor, SensorManager.SENSOR_DELAY_NORMAL);
    }

    @Override
    protected void onPause() {
        super.onPause();
        sensorManager.unregisterListener(this);
    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int accuracy) {
    }

    @Override
    public void onSensorChanged(SensorEvent event) {
        if (event.sensor.getType() == Sensor.TYPE_PRESSURE) {
            float pressureSensorValue = event.values[0];
            pressureSensorText.setText("Value: " + pressureSensorValue);
        }
    }
    @Override
    public void onBackPressed() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        super.onBackPressed();
    }
}
