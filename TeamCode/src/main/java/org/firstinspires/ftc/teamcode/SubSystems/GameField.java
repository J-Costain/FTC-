package org.firstinspires.ftc.teamcode.SubSystems;

import com.acmerobotics.roadrunner.geometry.Pose2d;
import com.acmerobotics.roadrunner.geometry.Vector2d;

public class GameField {
    // Declare a target vector you'd like your bot to align with
    // Can be any x/y coordinate of your choosing
    public static final Vector2d ORIGIN = new Vector2d(0,0);
    public static final Vector2d BLUE_TOWER_GOAL = new Vector2d(72,36);
    public static final Vector2d BLUE_POWERSHOT1 = new Vector2d(72,17.75);
    public static final Vector2d BLUE_POWERSHOT2 = new Vector2d(72,10.25);
    public static final Vector2d BLUE_POWERSHOT3 = new Vector2d(72,2.75);
    public static final Vector2d RED_POWERSHOT3 = new Vector2d(72,-2.75);
    public static final Vector2d RED_POWERSHOT2 = new Vector2d(72,-10.25);
    public static final Vector2d RED_POWERSHOT1 = new Vector2d(72,-17.75);
    public static final Vector2d RED_TOWER_GOAL = new Vector2d(72,-36);

    //Start Poses
    public static final Pose2d BLUE_INNER_START_LINE =  new Pose2d(-68,24,Math.toRadians(0));
    public static final Pose2d BLUE_OUTER_START_LINE =  new Pose2d(-68,48,Math.toRadians(0));
    public static final Pose2d RED_INNER_START_LINE =  new Pose2d(-68,-24,Math.toRadians(0));
    public static final Pose2d RED_OUTER_START_LINE =  new Pose2d(-68,-48,Math.toRadians(0));
    public static final Pose2d ORIGIN_FIELD =  new Pose2d(0,0,Math.toRadians(0));

    public enum PLAYING_ALLIANCE{
        RED_ALLIANCE,
        BLUE_ALLIANCE,
        AUDIENCE
    }
    public static PLAYING_ALLIANCE playingAlliance = PLAYING_ALLIANCE.AUDIENCE;
}
