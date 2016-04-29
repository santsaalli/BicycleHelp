package com.example.android.bicycleapp;

import java.util.ArrayList;
import java.util.List;


public class DataManager {

    private static List<BikeApp> data = new ArrayList<>();

    public static List<BikeApp> getData() {
        return data;
    }

    static {

        data.add(new BikeApp(10101, "BRAKES", "To center side pull brakes (road bikes), loosen the attaching bolt behind the fork crown or brake bridge until the brake is loose. (It should move sideways when you push it). Now, squeeze the lever to hold the brake pads against the rim while you tighten the brake bolt on the back of the frame. To prevent the pads from squeaking, toe the pads in slightly, so that the trailing edge contacts the wheel first. Make sure the pad height is near the center of the metal rim of you wheel. Pads mounted too low may slide off the rim, causing a dangerous situation, or if they are mounted too high, the pad will rub against the sidewall of the tire, which is also undesirable", 3));

        data.add(new BikeApp(10102, "HANDLEBARS", "Locate the Allen nut at the top of your bicycle's handlebar headset. The headset is made up of components that connect your handlebar's stem to the fork of your bicycle. You may have to remove a plastic protector cap to see the bolt.Ensure the handlebars are tight enough by standing in front of your bicycle with the front wheel held between your legs. Try to turn the handlebars. Your legs should prevent the wheel and the handlebars from turning. If your handlebars turn without your wheel turning, tighten the Allen bolt more.", 3));

        data.add(new BikeApp(10103, "DERAILLEURS", "The B-Screw controls the derailleur body's angle in relation to the sprocket-set. Shift down to the largest sprocket and check the distance between the guide pulley and the large sprocket. If the guide pulley is rubbing on the sprocket, tighten the B-screw clockwise to increase tension and move the pulley away from the sprocket. If there is a large gap between the pulley and sprocket, loosen the B-screw until the pulley rubs the sprocket, and then tighten it until it just clears", 2));

        data.add(new BikeApp(10104, "CABLES", "The first step is to carefully observe how your cable is presently routed from the lever to your brake. A misrouted cable can cause many problems. It may help to photograph each section of the cable from the lever to the brake so you can use it for reference.Before you fit a new cable to the front derailleur, shift the chain into the smallest chainring position. If you are fitting one to the rear derailleur, shift to the smallest cassette position. Remove the old cable by undoing the clamp bolt on the relevant derailleur and pushing the cable backward through all the housings and the shifter. Insert a new, lubricated cable into the shifter and back through all housings.", 2));

        data.add(new BikeApp(20101, "CHAINS", "Before removing the largest two chainrings you'll often have to remove the smallest one, which is often threaded directly into your crank arm. Use your allen key to loosen all of the bolts that hold the chainring in place, and then use a marker to make a note of the chainring's position in relation to the crank before removing it completely.", 3));

        data.add(new BikeApp(20102, "FREEWHEEL", "If your freewheel is really tight, you may need to mount the tool in a vise clamp so that you can use the wheel as leverage. I don't have a clamp to demonstrate this, but once mounted in the vise, you can easily turn the wheel counter-clockwise to loosen the freewheel.", 3));

        data.add(new BikeApp(20103, "PEDALS", "When removing your pedals, the first step is to make sure you have both wheels firmly on the ground. This will give you better support for the leverage that is required to loosen your very tight pedal threads.", 2));

        data.add(new BikeApp(30101, "WHEELS", "When removing your pedals, the first step is to make sure you have both wheels firmly on the ground. This will give you better support for the leverage that is required to loosen your very tight pedal threads.", 3));

        data.add(new BikeApp(30102, "STEMS", "When removing your pedals, the first step is to make sure you have both wheels firmly on the ground. This will give you better support for the leverage that is required to loosen your very tight pedal threads.", 3));

        data.add(new BikeApp(30103, "CASSETTE", "If your freewheel is really tight, you may need to mount the tool in a vise clamp so that you can use the wheel as leverage. I don't have a clamp to demonstrate this, but once mounted in the vise, you can easily turn the wheel counter-clockwise to loosen the freewheel.", 3));

        data.add(new BikeApp(30104, "BOTTOM BRACKET", "If your freewheel is really tight, you may need to mount the tool in a vise clamp so that you can use the wheel as leverage. I don't have a clamp to demonstrate this, but once mounted in the vise, you can easily turn the wheel counter-clockwise to loosen the freewheel.", 3));


    }
}
