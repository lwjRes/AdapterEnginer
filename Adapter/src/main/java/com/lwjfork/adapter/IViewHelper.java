package com.lwjfork.adapter;

import android.support.annotation.IdRes;
import android.support.annotation.StringRes;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.AppCompatAutoCompleteTextView;
import android.support.v7.widget.AppCompatButton;
import android.support.v7.widget.AppCompatCheckBox;
import android.support.v7.widget.AppCompatCheckedTextView;
import android.support.v7.widget.AppCompatEditText;
import android.support.v7.widget.AppCompatImageView;
import android.support.v7.widget.AppCompatMultiAutoCompleteTextView;
import android.support.v7.widget.AppCompatRadioButton;
import android.support.v7.widget.AppCompatSeekBar;
import android.support.v7.widget.AppCompatTextView;
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

public interface IViewHelper {

    @SuppressWarnings("unchecked")
    <T extends View> T findViewByID(int viewId);

    @SuppressWarnings("unchecked")
    default <T extends View> T findViewByID(View parent, int viewId) {
        return (T) parent.findViewById(viewId);
    }

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

    default AppCompatTextView findAppCompatTextViewById(int viewId) {
        return findViewByID(viewId);
    }

    default AppCompatEditText finAppCompatEditTextById(int viewId) {
        return findViewByID(viewId);
    }

    default AppCompatAutoCompleteTextView findAppCompatAutoCompleteTextViewById(int viewId) {
        return findViewByID(viewId);
    }

    default AppCompatMultiAutoCompleteTextView findAppCompatMultiAutoCompleteTextViewById(int viewId) {
        return findViewByID(viewId);
    }

    default AppCompatCheckedTextView findAppCompatCheckedTextViewById(int viewId) {
        return findViewByID(viewId);
    }

    default AppCompatButton findAppCompatButtonId(int viewId) {
        return findViewByID(viewId);
    }

    default AppCompatImageView findAppCompatImageViewById(int viewId) {
        return findViewByID(viewId);
    }

    default AppCompatCheckBox findAppCompatCheckBoxById(int viewId) {
        return findViewByID(viewId);
    }

    default AppCompatRadioButton findAppCompatRadioButtonById(int viewId) {
        return findViewByID(viewId);
    }

    default AppCompatSeekBar findAppCompatSeekBarById(int viewId) {
        return findViewByID(viewId);
    }


    default <T extends View> void setOnClickListener(T view, View.OnClickListener listener) {
        view.setOnClickListener(listener);
    }

    default void setOnClickListener(@IdRes int viewId, View.OnClickListener listener) {
        View view = findViewByID(viewId);
        setOnClickListener(view, listener);
    }



    default <T extends View> void setOnLongClickListener(T view, View.OnLongClickListener listener) {
        view.setOnLongClickListener(listener);
    }

    default void setOnLongClickListener(@IdRes int viewId, View.OnLongClickListener listener) {
        View view = findViewByID(viewId);
        setOnLongClickListener(view, listener);
    }

    default <T extends TextView> void setText(T view, CharSequence des) {
        view.setText(des);
    }


    default TextView setTextView(int id, CharSequence text) {
        TextView textView = findTextViewById(id);
        textView.setText(text);
        return textView;
    }

    default TextView setTextView(int id, CharSequence text, View.OnClickListener onClickListener) {
        TextView textView = findTextViewById(id);
        textView.setText(text);
        textView.setOnClickListener(onClickListener);
        return textView;
    }

    default ImageView setImageViewResource(int id, int resId) {
        ImageView imageView = findImageViewById(id);
        findImageViewById(id).setImageResource(resId);
        return imageView;
    }

    default ImageView setImageViewResource(int id, int resId, View.OnClickListener onClickListener) {
        ImageView imageView = findImageViewById(id);
        imageView.setImageResource(resId);
        imageView.setOnClickListener(onClickListener);
        return imageView;
    }

    default Button setButton(int id, CharSequence text) {
        Button button = findButtonById(id);
        button.setText(text);
        return button;
    }

    default Button setButton(int id, CharSequence text, View.OnClickListener onClickListener) {
        Button button = findButtonById(id);
        button.setText(text);
        button.setOnClickListener(onClickListener);
        return button;
    }

}
