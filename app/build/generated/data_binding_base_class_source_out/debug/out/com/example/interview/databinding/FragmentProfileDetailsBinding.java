// Generated by data binding compiler. Do not edit!
package com.example.interview.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.example.interview.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentProfileDetailsBinding extends ViewDataBinding {
  @NonNull
  public final TextView address;

  @NonNull
  public final TextView city;

  @NonNull
  public final TextView email;

  @NonNull
  public final TextView firstName;

  @NonNull
  public final TextView flatNo;

  @NonNull
  public final TextView landmark;

  @NonNull
  public final TextView lastName;

  @NonNull
  public final TextView midName;

  @NonNull
  public final TextView mobile;

  @NonNull
  public final TextView personaldetails;

  @NonNull
  public final TextView pincode;

  @NonNull
  public final TextView profileDetails;

  @NonNull
  public final TextView street;

  protected FragmentProfileDetailsBinding(Object _bindingComponent, View _root,
      int _localFieldCount, TextView address, TextView city, TextView email, TextView firstName,
      TextView flatNo, TextView landmark, TextView lastName, TextView midName, TextView mobile,
      TextView personaldetails, TextView pincode, TextView profileDetails, TextView street) {
    super(_bindingComponent, _root, _localFieldCount);
    this.address = address;
    this.city = city;
    this.email = email;
    this.firstName = firstName;
    this.flatNo = flatNo;
    this.landmark = landmark;
    this.lastName = lastName;
    this.midName = midName;
    this.mobile = mobile;
    this.personaldetails = personaldetails;
    this.pincode = pincode;
    this.profileDetails = profileDetails;
    this.street = street;
  }

  @NonNull
  public static FragmentProfileDetailsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_profile_details, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentProfileDetailsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentProfileDetailsBinding>inflateInternal(inflater, R.layout.fragment_profile_details, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentProfileDetailsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_profile_details, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentProfileDetailsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentProfileDetailsBinding>inflateInternal(inflater, R.layout.fragment_profile_details, null, false, component);
  }

  public static FragmentProfileDetailsBinding bind(@NonNull View view) {
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
  public static FragmentProfileDetailsBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentProfileDetailsBinding)bind(component, view, R.layout.fragment_profile_details);
  }
}