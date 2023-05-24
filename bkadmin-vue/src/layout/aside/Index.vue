<!-- eslint-disable vue/multi-word-component-names -->
<template>
    <div class="main">
      <!-- 菜单栏 -->
      <el-menu
      default-active="2"
      class="el-menu-vertical-demo"
      :collapse="store.isCollapse"
      v-for="menu in menuList"
    >
      <el-sub-menu v-if="menu.childrens.length>0" :index="menu.index">
        <template #title>
          <el-icon><location /></el-icon>
          <span>{{ menu.title }}</span>
        </template>
        <el-menu-item-group v-for="children in menu.childrens">
          <el-menu-item :index="children.index">
            <el-icon><icon-menu /></el-icon>
            <template #title>{{ children.title }}</template>
          </el-menu-item>
        </el-menu-item-group>
      </el-sub-menu>
  
      <el-menu-item v-else :index="menu.index">
        <el-icon><icon-menu /></el-icon>
        <template #title>{{ menu.title }}</template>
      </el-menu-item>
    </el-menu>
    </div>
  </template>
  
  <script lang="ts" setup>
  import {
    Document,
    Menu as IconMenu,
    Location,
    Setting,
  } from '@element-plus/icons-vue'
  import { useIndexStore } from '../../store/Index'
  
  const store = useIndexStore()
  
  const menuList = [
    { 
      index: 1,
      title: '系统管理',
      icon: 'location',
      childrens: [
        {
          index: 1-1,
          title: '日志管理',
          icon: 'location',
        }
      ],
    },
    {
      index: 2,
      title: '用户管理',
      icon: 'location',
      childrens: [
        {
          index: 2-1,
          title: '添加用户',
          icon: 'location',
        },
        {
          index: 2-2,
          title: '删除用户',
          icon: 'location',
        },
      ],
    },
    {
      index: 3,
      title: '博客管理',
      icon: 'location',
      childrens: []
    }
  ]
  
  </script>
  
  <style lang="less" scoped>
  .main {
    
  }
  </style>