class Solution:
    def findErrorNums(self, nums: List[int]) -> List[int]:
        l = len(nums)
        summ = sum(nums)
        rsum = l*(l+1)//2
        usum = sum(set(nums))
        return [summ-usum,rsum-usum]


        """
        nums.sort()
        print(nums)
        if nums[0] != 1: miss = 1
        for i in range(1,len(nums)):
            if nums[i]==nums[i-1]:
                rep = nums[i]
                break
        print(rep)
        nums.remove(rep)
        for i in range(1,len(nums)-1):
            if i+1 != nums[i]:
                miss = i+1
                break
        return [rep]+[miss]

        last = nums[0]
        op = []
        nums.remove(last)
        for i in nums:
            if i == last:
                op.append(i)
                op.append(i+1)
            last = i
        return op
        """