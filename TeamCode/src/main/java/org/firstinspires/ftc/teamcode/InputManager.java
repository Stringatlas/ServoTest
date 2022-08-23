package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp
public class InputManager extends  LinearOpMode{
    public void runOpMode() {
        telemetry.addData("Test", "Message");
        waitForStart();

        while (opModeIsActive()) {
            HandleInput();
        }


    }


    void HandleInput() {

    }
}
