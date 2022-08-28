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
public class DcTest extends OpMode{
    DcMotorEx dcMotor;
    double vel;
    boolean usingEncoder = false;

    @Override
    public void init() {
        dcMotor = hardwareMap.get(DcMotorEx.class, "dcMotor");

        dcMotor.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.FLOAT);
        dcMotor.setTargetPosition(100);
        dcMotor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        dcMotor.setMode(DcMotor.RunMode.RUN_USING_ENCODER);

    }

    @Override
    public void start() {
//        dcMotor.setMotorEnable();

    }

    @Override
    public void loop() {
        vel = dcMotor.getVelocity(AngleUnit.DEGREES);

        if (this.gamepad1.a) {
            dcMotor.setPower(this.gamepad1.left_stick_y);
        }

        if (this.gamepad1.b) {
            dcMotor.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
            usingEncoder = true;
        }

        if (this.gamepad1.x) {
            dcMotor.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
            usingEncoder = false;
        }


        telemetry.addData("Velocity: ", vel);
        telemetry.addData("Power: ", dcMotor.getPower());
        telemetry.addData("Position", dcMotor.getCurrentPosition());
        telemetry.addData("Encoder", usingEncoder);
        telemetry.update();
    }

}
