package com.briangriffey.notebook;

import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;

public class PageTurnGestureListener extends GestureDetector.SimpleOnGestureListener {
	private String TAG = "PageTurn";

//	@Override
//	public boolean onDown(MotionEvent event) {
//		Log.d(TAG, "onDown: " + event.toString());
//		return true;
//	}

//	@Override
//	public void onShowPress(MotionEvent event) {
//		Log.d(TAG, "onShowPress: " + event.toString());
//	}

	@Override
	public boolean onSingleTapUp(MotionEvent event) {
		Log.d(TAG, "onSingleTapUp: " + event.toString());
		return true;
	}

	@Override
	public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
		Log.d(TAG, "onScroll: " + e1.toString() + e2.toString());
		return true;
	}

//	@Override
//	public void onLongPress(MotionEvent event) {
//		Log.d(TAG, "onLongPress: " + event.toString());
//	}

	@Override
	public boolean onFling(MotionEvent event1, MotionEvent event2, float velocityX, float velocityY) {
		Log.d(TAG, "onFling: " + event1.toString() + event2.toString());
		return true;
	}
}
