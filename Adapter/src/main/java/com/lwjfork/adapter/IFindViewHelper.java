package com.lwjfork.adapter;

import android.support.v4.view.ViewPager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewStub;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CheckedTextView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.GridLayout;
import android.widget.GridView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.MultiAutoCompleteTextView;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.ViewFlipper;

/**
 * Created:2018/6/5
 * User：lwjfork
 * Email:lwjfork@gmail.com
 * Des:
 * ====================
 */

public interface IFindViewHelper {

    @SuppressWarnings("unchecked")
    <T extends View> T findViewByID(int viewId);


    default android.support.v4.widget.Space findSpaceV4ById(int viewId) {
        return findViewByID(viewId);
    }

    default android.widget.Space findSpaceById(int viewId) {
        return findViewByID(viewId);
    }

    default TextView findTextViewById(int viewId) {
        return findViewByID(viewId);
    }

    default EditText findEditTextById(int viewId) {
        return findViewByID(viewId);
    }

    default AutoCompleteTextView findAutoCompleteTextViewById(int viewId) {
        return findViewByID(viewId);
    }

    default MultiAutoCompleteTextView findMultiAutoCompleteTextViewById(int viewId) {
        return findViewByID(viewId);
    }

    default CheckedTextView findCheckedTextViewById(int viewId) {
        return findViewByID(viewId);
    }

    default Button findButtonById(int viewId) {
        return findViewByID(viewId);
    }

    default ProgressBar findProgressBarById(int viewId) {
        return findViewByID(viewId);
    }

    default ImageView findImageViewById(int viewId) {
        return findViewByID(viewId);
    }

    default ImageButton findImageButtonById(int viewId) {
        return findViewByID(viewId);
    }

    default CheckBox findCheckBoxById(int viewId) {
        return findViewByID(viewId);
    }

    default RadioButton findRadioButtonById(int viewId) {
        return findViewByID(viewId);
    }

    default Switch findSwitchById(int viewId) {
        return findViewByID(viewId);
    }

    default SeekBar findSeekBarById(int viewId) {
        return findViewByID(viewId);
    }

    default ViewStub findViewStubById(int viewId) {
        return findViewByID(viewId);
    }

    default LinearLayout findLinearLayoutById(int viewId) {
        return findViewByID(viewId);
    }

    default RadioGroup findRadioGroupById(int viewId) {
        return findViewByID(viewId);
    }

    default RelativeLayout findRelativeLayoutById(int viewId) {
        return findViewByID(viewId);
    }

    default FrameLayout findFrameLayoutById(int viewId) {
        return findViewByID(viewId);
    }

    default GridLayout findGridLayoutById(int viewId) {
        return findViewByID(viewId);
    }

    default RecyclerView findRecyclerViewById(int viewId) {
        return findViewByID(viewId);
    }

    default GridView findGridViewById(int viewId) {
        return findViewByID(viewId);
    }

    default ListView findListViewById(int viewId) {
        return findViewByID(viewId);
    }

    default ViewPager findViewPagerById(int viewId) {
        return findViewByID(viewId);
    }

    default ViewFlipper findViewFlipperById(int viewId) {
        return findViewByID(viewId);
    }
}
