package com.hg.gangwar.squareFloat;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageButton;

import com.hg.gangwar.R;


public class HgSquareFloatButton extends ImageButton {
    private String customAttr;

    public HgSquareFloatButton(Context context ) {
        this( context, null );
    }

    public HgSquareFloatButton(Context context, AttributeSet attrs ) {
        this( context, attrs, R.attr.imageButtonStyle );
    }

    public HgSquareFloatButton(Context context, AttributeSet attrs,
                               int defStyle ) {
        super( context, attrs, defStyle );

    }
}
