package com.agrim.edulight;

import android.app.LauncherActivity;
import android.widget.ImageView;

/**
 * Created by agrim on 20/11/17.
 */

public class contents2 {

    public String head;
    public String desc;
    public ImageView im1;

    public contents2(String head, String desc){
        this.head = head;
        this.desc=desc;
    }

    public contents2() {

    }

    public String getHead(){return head;}
    public String getDesc(){return desc;}
}
