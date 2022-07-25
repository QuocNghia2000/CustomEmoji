package com.custom.emoji;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import com.custom.emoji.emojiicon.EmojiconsPopup;

public class MainActivity extends AppCompatActivity {
    EmojiconsPopup popupWindow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showEmoticons();
    }

    public void showEmoticons() {
        LayoutInflater layoutInflater = (LayoutInflater) getBaseContext().getSystemService(LAYOUT_INFLATER_SERVICE);
        if (layoutInflater != null) {
            View popupView = layoutInflater.inflate(R.layout.emoji_listview_layout, null);
            FrameLayout root = findViewById(R.id.rootView);
            popupWindow = new EmojiconsPopup(popupView, this);
            popupWindow.setSizeForSoftKeyboard();
            popupWindow.setSize(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
            root.post(new Runnable() {
                @Override
                public void run() {
                    popupWindow.showAtLocation(root, Gravity.BOTTOM, 0, 0);
                }
            });

            // If the text keyboard closes, also dismiss the emoji popup
            popupWindow.setOnSoftKeyboardOpenCloseListener(new EmojiconsPopup.OnSoftKeyboardOpenCloseListener() {
                @Override
                public void onKeyboardOpen(int keyBoardHeight) {
                }

                @Override
                public void onKeyboardClose() {
                    if (popupWindow.isShowing())
                        popupWindow.dismiss();
                }
            });
        }
    }
}