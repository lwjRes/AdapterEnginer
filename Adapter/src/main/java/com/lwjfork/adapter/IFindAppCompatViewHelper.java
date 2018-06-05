package com.lwjfork.adapter;

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

/**
 * Created:2018/6/5
 * User：lwjfork
 * Email:lwjfork@gmail.com
 * Des:
 * ====================
 */

public interface IFindAppCompatViewHelper extends IFindViewHelper {


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

}
