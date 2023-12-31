package com.example.interview;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0001\u0013B\u0005\u00a2\u0006\u0002\u0010\u0004J\u001c\u0010\n\u001a\u00020\t2\n\u0010\u000b\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\f\u001a\u00020\u0007H\u0016J\u001c\u0010\r\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0007H\u0016J \u0010\u0011\u001a\u00020\t2\u0018\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0006R\"\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/example/interview/ProductAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/example/interview/model/ProductModel;", "Lcom/example/interview/ProductAdapter$ProductVH;", "()V", "onItemClickListener", "Lkotlin/Function2;", "", "", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setOnItemClickListener", "listener", "ProductVH", "app_debug"})
public final class ProductAdapter extends androidx.recyclerview.widget.ListAdapter<com.example.interview.model.ProductModel, com.example.interview.ProductAdapter.ProductVH> {
    private kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super java.lang.String, kotlin.Unit> onItemClickListener;
    
    public ProductAdapter() {
        super(null);
    }
    
    public final void setOnItemClickListener(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super java.lang.String, kotlin.Unit> listener) {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public com.example.interview.ProductAdapter.ProductVH onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    com.example.interview.ProductAdapter.ProductVH holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/example/interview/ProductAdapter$ProductVH;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/example/interview/databinding/ProductsListIemBinding;", "(Lcom/example/interview/ProductAdapter;Lcom/example/interview/databinding/ProductsListIemBinding;)V", "bind", "", "item", "Lcom/example/interview/model/ProductModel;", "app_debug"})
    public final class ProductVH extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.example.interview.databinding.ProductsListIemBinding binding = null;
        
        public ProductVH(@org.jetbrains.annotations.NotNull
        com.example.interview.databinding.ProductsListIemBinding binding) {
            super(null);
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull
        com.example.interview.model.ProductModel item) {
        }
    }
}