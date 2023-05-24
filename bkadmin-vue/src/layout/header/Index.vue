<template>
    <div class="main">
        <el-row :gutter="0" style="height: 10%;">
            <el-col :xs="8" :sm="6" :md="4" :lg="3" :xl="1"
              style="flex: 0 0 5%;" ><div class="grid-content ep-bg-purple"
            >
            <el-icon><a @click="store.changeIsCollapse">
                <p v-if="store.isCollapse">
                    <Expand />
                </p>
                <p v-else>
                    <Fold />
                </p>
            </a></el-icon></div></el-col>
            <el-col :xs="4" :sm="6" :md="8" :lg="9" :xl="11"
              ><div class="grid-content ep-bg-purple-light"
            >
            <el-breadcrumb :separator-icon="ArrowRight">
                <el-breadcrumb-item :to="{ path: '/' }">homepage</el-breadcrumb-item>
                <el-breadcrumb-item>promotion management</el-breadcrumb-item>
                <el-breadcrumb-item>promotion list</el-breadcrumb-item>
                <el-breadcrumb-item>promotion detail</el-breadcrumb-item>
            </el-breadcrumb></div></el-col>
            <el-col :xs="4" :sm="6" :md="8" :lg="9" :xl="11"
              ><div class="grid-content ep-bg-purple"
            >
            <el-avatar src="https://cube.elemecdn.com/0/88/03b0d39583f48206768a7534e55bcpng.png" /></div></el-col>
          </el-row>
    </div>
</template>

<script lang="ts" setup>
import {
    Fold,
    Expand,

} from '@element-plus/icons-vue'
import { ArrowRight } from '@element-plus/icons-vue'
import { ref, watch } from 'vue';
import { useIndexStore } from '../../store/Index.ts'

const store = useIndexStore()

const buttonIcon = ref(Fold)


// 只监听pinia中某一个值的变化
watch(() => store.isCollapse, (newValue, oldValue) => {
    if (newValue) {
        buttonIcon.value = Expand
    } else {
        buttonIcon.value = Fold
    }
})

</script>

<style lang="less" scoped>.main {}</style>