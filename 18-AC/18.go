package main

func merge(nums1 []int, m int, nums2 []int, n int) {
	var p, q = 0, 0
	var tmp = make([]int, m+n, m+n)
	for p < m || q < n {
		if p == m {
			tmp[p+q] = nums2[q]
			q += 1
		} else if q == n {
			tmp[p+q] = nums1[p]
			p += 1
		} else if nums1[p] < nums2[q] {
			tmp[p+q] = nums1[p]
			p += 1
		} else {
			tmp[p+q] = nums2[q]
			q += 1
		}
	}

	for i := 0; i < m+n; i++ {
		nums1[i] = tmp[i]
	}
}

// 测试
func main() {
	merge([]int{1, 2, 3, 0, 0, 0}, 3, []int{2, 5, 6}, 3)
}
