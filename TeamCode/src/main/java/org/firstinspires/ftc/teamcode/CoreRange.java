package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DistanceSensor;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.OpticalDistanceSensor;
import com.qualcomm.robotcore.hardware.IrSeekerSensor;

import org.firstinspires.ftc.robotcore.external.navigation.AngleUnit;
import org.firstinspires.ftc.robotcore.external.navigation.DistanceUnit;

@TeleOp
public class CoreRange extends OpMode{
    DistanceSensor distanceSensor;
    OpticalDistanceSensor opticalDistanceSensor;
    IrSeekerSensor irSensor;

    DcMotorEx dcMotor;

    double vel;

    @Override
    public void init() {
        dcMotor = hardwareMap.get(DcMotorEx.class, "dcMotor");
        dcMotor.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.FLOAT);


        distanceSensor = hardwareMap.get(DistanceSensor.class, "distanceSensor");
        opticalDistanceSensor = hardwareMap.get(OpticalDistanceSensor.class, "optical");
//        irSensor = hardwareMap.get(IrSeekerSensor.class, "irSensor");
    }

    @Override
    public void start() {
        dcMotor.setMotorEnable();
        dcMotor.setTargetPosition(100);
        dcMotor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
    }

    @Override
    public void loop() {
        double dist = distanceSensor.getDistance(DistanceUnit.CM);
        double optical = opticalDistanceSensor.getLightDetected();

        vel = dcMotor.getVelocity(AngleUnit.DEGREES);

//        if (this.gamepad1.left_trigger == 1) {
//            dcMotor.setPower(1);
////            dcMotor.setVelocity(15, AngleUnit.DEGREES);
//        }
//        else if (this.gamepad1.right_trigger == 1) {
//            dcMotor.setPower(-1);
////            dcMotor.setVelocity(-15, AngleUnit.DEGREES);
////            dcMotor.setTargetPosition(100);
//        }
//        else {
//            dcMotor.setPower(0);
////            dcMotor.setVelocity(0, AngleUnit.DEGREES);
////            dcMotor.setTargetPosition(0);
//        }

        dcMotor.setPower(this.gamepad1.left_stick_y);


        dcMotor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        dcMotor.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);

        telemetry.addData("Distance: ", dist);
        telemetry.addData("Light level", optical);
        telemetry.addData("Velocity: ", vel);
        telemetry.addData("Power: ", dcMotor.getPower());
        telemetry.addData("Position", dcMotor.getCurrentPosition());
        telemetry.update();
    }

}
