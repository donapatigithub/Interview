package com.example.interview.databinding;
import com.example.interview.R;
import com.example.interview.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentProductsListBindingImpl extends FragmentProductsListBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.cancel, 2);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentProductsListBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 3, sIncludes, sViewsWithIds));
    }
    private FragmentProductsListBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.ImageButton) bindings[2]
            , (androidx.recyclerview.widget.RecyclerView) bindings[1]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.productsRecycle.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.viewModel == variableId) {
            setViewModel((com.example.interview.model.ProductViewModel) variable);
        }
        else if (BR.productItems == variableId) {
            setProductItems((androidx.lifecycle.LiveData<java.util.List<com.example.interview.model.ProductModel>>) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.example.interview.model.ProductViewModel ViewModel) {
        this.mViewModel = ViewModel;
    }
    public void setProductItems(@Nullable androidx.lifecycle.LiveData<java.util.List<com.example.interview.model.ProductModel>> ProductItems) {
        updateLiveDataRegistration(0, ProductItems);
        this.mProductItems = ProductItems;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.productItems);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeProductItems((androidx.lifecycle.LiveData<java.util.List<com.example.interview.model.ProductModel>>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeProductItems(androidx.lifecycle.LiveData<java.util.List<com.example.interview.model.ProductModel>> ProductItems, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        java.util.List<com.example.interview.model.ProductModel> productItemsGetValue = null;
        androidx.lifecycle.LiveData<java.util.List<com.example.interview.model.ProductModel>> productItems = mProductItems;

        if ((dirtyFlags & 0x5L) != 0) {



                if (productItems != null) {
                    // read productItems.getValue()
                    productItemsGetValue = productItems.getValue();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            com.example.interview.BindingAdapterKt.bindProducts(this.productsRecycle, productItemsGetValue);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): productItems
        flag 1 (0x2L): viewModel
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}