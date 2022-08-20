package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.CRServo;

@TeleOp
public class TestServo extends LinearOpMode{
    private CRServo testServo;

    public void runOpMode(){
        testServo = hardwareMap.get(CRServo.class, "testServo");
        telemetry.addData("Controls", "Use Controls A and B to turn servo" );
        telemetry.update();
        double power = 0.9;

        waitForStart();

        while(opModeIsActive()) {
            if (this.gamepad1.a) {
                testServo.setPower(-power);
            } else if (this.gamepad1.b) {
                testServo.setPower(power);
            } else {
                testServo.setPower(0);
            }
        }
    }
}



