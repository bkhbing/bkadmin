<template>
  <div class="common-layout">
    <el-container>
      <el-aside width='205'>
        <aside-box/>
      </el-aside>
      <el-container>
        <el-header>
          <header-box/>
        </el-header>
        <el-main>Main</el-main>
      </el-container>
    </el-container>
  </div>
</template>

<script>
import AsideVue from './aside/Index.vue';
import HeaderVue from './header/Index.vue';
export default {
  components: {
    'aside-box': AsideVue,
    'header-box': HeaderVue
  }
}
</script>

<style lang="less" scoped>
</style>
