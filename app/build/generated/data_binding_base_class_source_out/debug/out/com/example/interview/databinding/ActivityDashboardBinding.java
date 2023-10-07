// Generated by data binding compiler. Do not edit!
package com.example.interview.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.appcompat.widget.SearchView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.example.interview.DashboardAdapter;
import com.example.interview.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityDashboardBinding extends ViewDataBinding {
  @NonNull
  public final BottomNavigationView bottomNav;

  @NonNull
  public final RecyclerView dashRV;

  @NonNull
  public final AppCompatImageView homeimg;

  @NonNull
  public final HorizontalScrollView hscrollview;

  @NonNull
  public final LinearLayoutCompat imgscroll;

  @NonNull
  public final TextView offertitle;

  @NonNull
  public final SearchView search;

  @NonNull
  public final AppCompatTextView txt;

  @Bindable
  protected DashboardAdapter mAdapter;

  protected ActivityDashboardBinding(Object _bindingComponent, View _root, int _localFieldCount,
      BottomNavigationView bottomNav, RecyclerView dashRV, AppCompatImageView homeimg,
      HorizontalScrollView hscrollview, LinearLayoutCompat imgscroll, TextView offertitle,
      SearchView search, AppCompatTextView txt) {
    super(_bindingComponent, _root, _localFieldCount);
    this.bottomNav = bottomNav;
    this.dashRV = dashRV;
    this.homeimg = homeimg;
    this.hscrollview = hscrollview;
    this.imgscroll = imgscroll;
    this.offertitle = offertitle;
    this.search = search;
    this.txt = txt;
  }

  public abstract void setAdapter(@Nullable DashboardAdapter adapter);

  @Nullable
  public DashboardAdapter getAdapter() {
    return mAdapter;
  }

  @NonNull
  public static ActivityDashboardBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_dashboard, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityDashboardBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityDashboardBinding>inflateInternal(inflater, R.layout.activity_dashboard, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityDashboardBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_dashboard, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityDashboardBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityDashboardBinding>inflateInternal(inflater, R.layout.activity_dashboard, null, false, component);
  }

  public static ActivityDashboardBinding bind(@NonNull View view) {
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
  public static ActivityDashboardBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActivityDashboardBinding)bind(component, view, R.layout.activity_dashboard);
  }
}
