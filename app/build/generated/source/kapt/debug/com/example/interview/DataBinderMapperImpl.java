package com.example.interview;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.example.interview.databinding.ActivityRegisterBindingImpl;
import com.example.interview.databinding.FragmentAddressBindingImpl;
import com.example.interview.databinding.FragmentHomeBindingImpl;
import com.example.interview.databinding.FragmentItemDetailsBindingImpl;
import com.example.interview.databinding.FragmentProductsListBindingImpl;
import com.example.interview.databinding.FragmentProfileDetailsBindingImpl;
import com.example.interview.databinding.FragmentWeatherBindingImpl;
import com.example.interview.databinding.ItemDashboardBindingImpl;
import com.example.interview.databinding.ProductsListIemBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYREGISTER = 1;

  private static final int LAYOUT_FRAGMENTADDRESS = 2;

  private static final int LAYOUT_FRAGMENTHOME = 3;

  private static final int LAYOUT_FRAGMENTITEMDETAILS = 4;

  private static final int LAYOUT_FRAGMENTPRODUCTSLIST = 5;

  private static final int LAYOUT_FRAGMENTPROFILEDETAILS = 6;

  private static final int LAYOUT_FRAGMENTWEATHER = 7;

  private static final int LAYOUT_ITEMDASHBOARD = 8;

  private static final int LAYOUT_PRODUCTSLISTIEM = 9;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(9);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.interview.R.layout.activity_register, LAYOUT_ACTIVITYREGISTER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.interview.R.layout.fragment_address, LAYOUT_FRAGMENTADDRESS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.interview.R.layout.fragment_home, LAYOUT_FRAGMENTHOME);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.interview.R.layout.fragment_item_details, LAYOUT_FRAGMENTITEMDETAILS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.interview.R.layout.fragment_products_list, LAYOUT_FRAGMENTPRODUCTSLIST);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.interview.R.layout.fragment_profile_details, LAYOUT_FRAGMENTPROFILEDETAILS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.interview.R.layout.fragment_weather, LAYOUT_FRAGMENTWEATHER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.interview.R.layout.item_dashboard, LAYOUT_ITEMDASHBOARD);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.interview.R.layout.products_list_iem, LAYOUT_PRODUCTSLISTIEM);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYREGISTER: {
          if ("layout/activity_register_0".equals(tag)) {
            return new ActivityRegisterBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_register is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTADDRESS: {
          if ("layout/fragment_address_0".equals(tag)) {
            return new FragmentAddressBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_address is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTHOME: {
          if ("layout/fragment_home_0".equals(tag)) {
            return new FragmentHomeBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_home is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTITEMDETAILS: {
          if ("layout/fragment_item_details_0".equals(tag)) {
            return new FragmentItemDetailsBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_item_details is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTPRODUCTSLIST: {
          if ("layout/fragment_products_list_0".equals(tag)) {
            return new FragmentProductsListBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_products_list is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTPROFILEDETAILS: {
          if ("layout/fragment_profile_details_0".equals(tag)) {
            return new FragmentProfileDetailsBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_profile_details is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTWEATHER: {
          if ("layout/fragment_weather_0".equals(tag)) {
            return new FragmentWeatherBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_weather is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMDASHBOARD: {
          if ("layout/item_dashboard_0".equals(tag)) {
            return new ItemDashboardBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_dashboard is invalid. Received: " + tag);
        }
        case  LAYOUT_PRODUCTSLISTIEM: {
          if ("layout/products_list_iem_0".equals(tag)) {
            return new ProductsListIemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for products_list_iem is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(6);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "adapter");
      sKeys.put(2, "item");
      sKeys.put(3, "product");
      sKeys.put(4, "productItems");
      sKeys.put(5, "viewModel");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(9);

    static {
      sKeys.put("layout/activity_register_0", com.example.interview.R.layout.activity_register);
      sKeys.put("layout/fragment_address_0", com.example.interview.R.layout.fragment_address);
      sKeys.put("layout/fragment_home_0", com.example.interview.R.layout.fragment_home);
      sKeys.put("layout/fragment_item_details_0", com.example.interview.R.layout.fragment_item_details);
      sKeys.put("layout/fragment_products_list_0", com.example.interview.R.layout.fragment_products_list);
      sKeys.put("layout/fragment_profile_details_0", com.example.interview.R.layout.fragment_profile_details);
      sKeys.put("layout/fragment_weather_0", com.example.interview.R.layout.fragment_weather);
      sKeys.put("layout/item_dashboard_0", com.example.interview.R.layout.item_dashboard);
      sKeys.put("layout/products_list_iem_0", com.example.interview.R.layout.products_list_iem);
    }
  }
}
