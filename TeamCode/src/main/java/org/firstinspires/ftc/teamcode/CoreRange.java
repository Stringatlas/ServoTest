package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DistanceSensor;
import com.qualcomm.robotcore.hardware.Servo;

import org.firstinspires.ftc.robotcore.external.navigation.DistanceUnit;

@TeleOp
public class CoreRange extends OpMode{
    DistanceSensor distanceSensor;
    Servo testServo;

    @Override
    public void init() {

        testServo = hardwareMap.servo.get("servoTest");
        distanceSensor = hardwareMap.get(DistanceSensor.class, "distanceSensor");
    }

    @Override
    public void start() {

    }

    @Override
    public void loop() {
        double dist = distanceSensor.getDistance(DistanceUnit.CM);

        if (dist < 100) {
            testServo.setPosition(1);
        }
        else {
            testServo.setPosition(0);
        }

        telemetry.addData("Distance: ", dist);
        telemetry.update();
    }

}
