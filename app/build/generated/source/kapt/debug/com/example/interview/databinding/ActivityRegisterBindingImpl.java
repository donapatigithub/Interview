package com.example.interview.databinding;
import com.example.interview.R;
import com.example.interview.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityRegisterBindingImpl extends ActivityRegisterBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.registertitle, 1);
        sViewsWithIds.put(R.id.personaldetails, 2);
        sViewsWithIds.put(R.id.regfirstName, 3);
        sViewsWithIds.put(R.id.regmidName, 4);
        sViewsWithIds.put(R.id.reglastName, 5);
        sViewsWithIds.put(R.id.regMobile, 6);
        sViewsWithIds.put(R.id.regEmail, 7);
        sViewsWithIds.put(R.id.address, 8);
        sViewsWithIds.put(R.id.flatNo, 9);
        sViewsWithIds.put(R.id.street, 10);
        sViewsWithIds.put(R.id.landmark, 11);
        sViewsWithIds.put(R.id.city, 12);
        sViewsWithIds.put(R.id.pincode, 13);
        sViewsWithIds.put(R.id.passwordtag, 14);
        sViewsWithIds.put(R.id.regPassword, 15);
        sViewsWithIds.put(R.id.regCnfPassword, 16);
        sViewsWithIds.put(R.id.buttons, 17);
        sViewsWithIds.put(R.id.register, 18);
        sViewsWithIds.put(R.id.cancel, 19);
    }
    // views
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityRegisterBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 20, sIncludes, sViewsWithIds));
    }
    private ActivityRegisterBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.TextView) bindings[8]
            , (android.widget.LinearLayout) bindings[17]
            , (android.widget.Button) bindings[19]
            , (android.widget.EditText) bindings[12]
            , (android.widget.EditText) bindings[9]
            , (android.widget.EditText) bindings[11]
            , (android.widget.TextView) bindings[14]
            , (android.widget.TextView) bindings[2]
            , (android.widget.EditText) bindings[13]
            , (android.widget.EditText) bindings[16]
            , (android.widget.EditText) bindings[7]
            , (android.widget.EditText) bindings[6]
            , (android.widget.EditText) bindings[15]
            , (android.widget.EditText) bindings[3]
            , (android.widget.Button) bindings[18]
            , (android.widget.TextView) bindings[1]
            , (android.widget.EditText) bindings[5]
            , (android.widget.EditText) bindings[4]
            , (android.widget.EditText) bindings[10]
            );
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x1L;
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
            return variableSet;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
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
        // batch finished
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): null
    flag mapping end*/
    //end
}