// Generated by data binding compiler. Do not edit!
package com.example.interview.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.example.interview.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentAddressBinding extends ViewDataBinding {
  @NonNull
  public final ImageButton cancel;

  @NonNull
  public final Button delbtn;

  @NonNull
  public final EditText edtText;

  @NonNull
  public final Button savebtn;

  @NonNull
  public final TextView savedText;

  protected FragmentAddressBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ImageButton cancel, Button delbtn, EditText edtText, Button savebtn, TextView savedText) {
    super(_bindingComponent, _root, _localFieldCount);
    this.cancel = cancel;
    this.delbtn = delbtn;
    this.edtText = edtText;
    this.savebtn = savebtn;
    this.savedText = savedText;
  }

  @NonNull
  public static FragmentAddressBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_address, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentAddressBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentAddressBinding>inflateInternal(inflater, R.layout.fragment_address, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentAddressBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_address, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentAddressBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentAddressBinding>inflateInternal(inflater, R.layout.fragment_address, null, false, component);
  }

  public static FragmentAddressBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static FragmentAddressBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentAddressBinding)bind(component, view, R.layout.fragment_address);
  }
}
